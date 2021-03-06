package com.bobo.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.cms.dao.ArticleMapper;
import com.bobo.cms.domain.Article;
import com.bobo.cms.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Resource
	private ArticleMapper articleMapper;

	@Override
	public int insert(Article article) {
		return articleMapper.insert(article);
	}

	@Override
	public PageInfo<Article> selects(Article article, Integer page, Integer pgeSize) {
		PageHelper.startPage(page, pgeSize);
		List<Article> list = articleMapper.selects(article);
		return new PageInfo<Article>(list);
	}

	@Override
	public Article select(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.select(id);
	}
	
	

}
