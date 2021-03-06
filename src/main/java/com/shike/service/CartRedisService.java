package com.shike.service;

import com.shike.model.Cart;
import com.shike.vo.CartAddParam;
import com.shike.vo.CartDelParam;
import com.shike.vo.CartEditParam;
import com.shike.vo.CartQuery;

import java.util.List;

/**
 * 购物车Redis服务
 * Created by shike on 16/4/29.
 */
public interface CartRedisService {
    /**
     * 查询购物车信息
     * @param cartQuery 购物车查询对象
     * @return Cart 购物车信息
     * @throws Exception
     */
    Cart getCart(CartQuery cartQuery) throws Exception;

    /**
     * 加车, 回写Redis
     * @param cartAddParam
     * @return 是否加车成功
     * @throws Exception
     */
    Boolean addCart(CartAddParam cartAddParam) throws Exception;

    /**
     * 查询多条Cart信息,即购物车列表
     * @param cartQuery
     * @return
     */
    List<Cart> getAll(CartQuery cartQuery) throws Exception;

    /**
     * 编辑Sku数量
     * @param cartEditParam
     * @return
     * @throws Exception
     */
    Boolean editSkuAmount(CartEditParam cartEditParam) throws Exception;
    /**
     * 删除购物车
     * @param carts 购物车列表
     * @return 是否删除成功
     * @throws Exception
     */
    Boolean delectCart(List<CartDelParam> carts) throws Exception;
}
