package com.qianting.yoga.studio.controller;

import com.qianting.yoga.studio.domian.entity.ResponseResult;
import com.qianting.yoga.studio.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章
 * @author Me
 * @version 1.0
 * @date 2024/11/5 8:42
 * @Description:文章表：包含文章访问的接口
 */

@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {
   @Autowired
   private ArticleService articleService;

    /**
     * 获取所有文章列表所有文章
     * @return
     */
   @GetMapping("/articleInformationList")
   public ResponseResult articleListInformation(){
      return articleService. articleListInformation();
   }
}
