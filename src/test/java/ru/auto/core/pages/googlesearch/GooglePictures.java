package ru.auto.core.pages.googlesearch;

import org.openqa.selenium.support.FindBy;
import ru.auto.core.blocks.googlesearch.ImagesBlock;
import ru.auto.core.blocks.googlesearch.LinksBlock;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "GooglePictures")
public class GooglePictures extends Page {

    public GooglePictures() {
        PageFactory.initElements(
                new HtmlElementDecorator(new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ElementTitle("Images")
    public ImagesBlock imagesBlock;

    @ActionTitle("Проверяем на соответствие с ожидаемыми значениями")
    public void searching(String nums, String wordRoot) throws InterruptedException {
        int size = Integer.parseInt(nums);
        for (int i = 0; i < size; i++) {
            if (imagesBlock.images.get(i).getAttribute("alt").toLowerCase().contains(wordRoot)) {
                System.out.println("Картинка " + i + " содержит информацию о " + wordRoot);
            } else {
                System.out.println("Картинка " + i + " не содержит информацию о " + wordRoot);
            }
        }
    }
}