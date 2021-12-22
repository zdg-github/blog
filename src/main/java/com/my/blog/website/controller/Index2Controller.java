package com.my.blog.website.controller;

import com.github.pagehelper.PageInfo;
import com.my.blog.website.constant.WebConst;
import com.my.blog.website.dto.ErrorCode;
import com.my.blog.website.dto.MetaDto;
import com.my.blog.website.dto.Types;
import com.my.blog.website.exception.TipException;
import com.my.blog.website.modal.Bo.ArchiveBo;
import com.my.blog.website.modal.Bo.CommentBo;
import com.my.blog.website.modal.Bo.RestResponseBo;
import com.my.blog.website.modal.Vo.CommentVo;
import com.my.blog.website.modal.Vo.ContentVo;
import com.my.blog.website.modal.Vo.MetaVo;
import com.my.blog.website.service.ICommentService;
import com.my.blog.website.service.IContentService;
import com.my.blog.website.service.IMetaService;
import com.my.blog.website.service.ISiteService;
import com.my.blog.website.utils.IPKit;
import com.my.blog.website.utils.PatternKit;
import com.my.blog.website.utils.TaleUtils;
import com.vdurmont.emoji.EmojiParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.util.List;

/**
 * 首页
 * Created by Administrator on 2017/3/8 008.
 */
@RestController
@RequestMapping("/test")
public class Index2Controller extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(Index2Controller.class);

    @Resource
    private IContentService contentService;

    @Resource
    private ICommentService commentService;

    @Resource
    private IMetaService metaService;

    @Resource
    private ISiteService siteService;

    /**
     * 首页
     *
     * @return
     */
    @GetMapping(value = {"/", "index"})
    public String index(HttpServletRequest request, @RequestParam(value = "limit", defaultValue = "12") int limit) {
        return "'index'";
    }

}
