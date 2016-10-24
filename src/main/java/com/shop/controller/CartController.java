package com.shop.controller;

import com.shop.dao.OrderDao;
import com.shop.entity.Product;
import com.shop.entity.User;
import com.shop.service.CartService;
import com.shop.service.OrderService;
import com.shop.service.ProductService;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by dima- on 23.10.2016.
 */
@Controller
public class CartController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "add-to-cart", method = RequestMethod.POST)
    @ResponseBody
    public String addProductToCart(Principal principal, @RequestParam int productId, @RequestParam int numberOfProducts) {
        if (principal == null) {
            return "login";
        } else {
            Product product = productService.getProductById(new Long(productId));
            User user = userService.getUserByEmail(principal.getName());

            orderService.addNewProductToOrder(user, product, numberOfProducts);

            return "";
        }
    }

    @RequestMapping(value = "/cart")
    public String cartPage(Principal principal, Model model) {
        if (principal == null) {
            return "login";
        } else {
            User user = userService.getUserByEmail(principal.getName());

            model.addAttribute("productInCart", orderDao.getUnpaidOrder(user).getOrdersDetails());
            return "cart";
        }
    }

    @RequestMapping(value = "buy-product")
    public String buy(Principal principal) {
        orderService.payOrder(userService.getUserByEmail(principal.getName()));
        return "all-products";
    }

    @RequestMapping(value = "delete-from-cart", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteProductFromCart(Principal principal, @RequestParam long deletingId) {
        cartService.deleteFromCart(userService.getUserByEmail(principal.getName()), deletingId);
    }
}
