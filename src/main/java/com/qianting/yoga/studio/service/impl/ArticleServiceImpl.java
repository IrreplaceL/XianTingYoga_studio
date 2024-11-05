package com.qianting.yoga.studio.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qianting.yoga.studio.domian.entity.Article;
import com.qianting.yoga.studio.domian.entity.ResponseResult;
import com.qianting.yoga.studio.domian.entity.User;
import com.qianting.yoga.studio.mapper.ArticleMapper;
import com.qianting.yoga.studio.service.ArticleService;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 文章表，存储用户发布的文章(Article)表服务实现类
 *
 * @author makejava
 * @since 2024-11-05 08:34:17
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public ResponseResult articlerListInformation() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //按照用户id升序排列
        queryWrapper.orderByAsc(Article::getArticleId);
        Page<Article> page = new Page(1,10);
        page(page,queryWrapper);
        //封装响应
        List<Article> articles = page.getRecords();
        //利用工具类
        return ResponseResult.successResult(articles);

    }
}