package cn.chiichen.gamevibes.model.response

import cn.chiichen.gamevibes.model.entities.Article

data class ArticleResponse(
    val size: Int,
    var articles: MutableList<Article>
)
