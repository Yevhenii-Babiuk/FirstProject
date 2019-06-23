package project.first.epam.babiuk.ArticlePrototype;

public class ArticleClient {
    public static void main(String[] args) {
        Article article1 = new WikiArticle("Title 1", "Article 1");
        Article article2 = new WikiArticle("Title 2", "Article 2");
        Article article3 = new WikiArticle("Title 3", "Article 3");
        Wiki.addArticle(article1);
        Wiki.addArticle(article2);
        Wiki.addArticle(article3);

        Article wikiArticle = Wiki.getArticle("Title 1");
        System.out.println(wikiArticle.getText());

        wikiArticle.setText("Some text");
        System.out.println(wikiArticle.getText());

        wikiArticle = Wiki.getArticle("Title 1");
        System.out.println(wikiArticle.getText());
    }
}
