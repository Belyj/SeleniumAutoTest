package ru.auto.core.pages.googlesearch;

import org.openqa.selenium.By;
import ru.auto.core.blocks.googlesearch.Categories;
import ru.auto.core.blocks.googlesearch.LinksBlock;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "SearchResult")
public class SearchResult extends Page {

    @ElementTitle("Links")
    public LinksBlock linksBlock;

    @ElementTitle("Categories")
    public Categories categories;

    public SearchResult() {
        PageFactory.initElements(
                new HtmlElementDecorator(new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("Проверяем на соответствие с ожидаемыми значениями значения активных ссылок на первых страницах")
    public void someNumsPagesResultCompare(String nums, String wordRoot) {
        int size = Integer.parseInt(nums);
        for (int i = 0; i < size; i++) {
            if (linksBlock.results.get(i).getText().toLowerCase().contains(wordRoot)) {
                System.out.println("Ссылка " + i + " содержит информацию о " + wordRoot);
            } else {
                System.out.println("Ссылка " + i + " не содержит информацию о " + wordRoot);
            }
        }
    }

    @ActionTitle("Переходим в категорию")
    public void goToCategorie(String categorie) {
        categories.findElement(By.xpath("//*[text() = '" + categorie + "']")).click();
    }
}