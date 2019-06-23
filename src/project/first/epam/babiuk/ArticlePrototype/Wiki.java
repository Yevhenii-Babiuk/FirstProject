package project.first.epam.babiuk.ArticlePrototype;

import java.util.HashMap;

public class Wiki {
    private static HashMap<String, Article> articlesBase = new HashMap<>();

    public static Article getArticle(String article) {
        return articlesBase.get(article).clone();
    }

    public static void addArticle(Article article) {
        articlesBase.put(article.getTitle(), article);
    }
}
