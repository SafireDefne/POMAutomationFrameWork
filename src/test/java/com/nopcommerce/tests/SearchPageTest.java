package com.nopcommerce.tests;

import com.nopcommerce.base.BaseTest;
import com.nopcommerce.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {

    @BeforeMethod

    public void searchPageSetup() {

        searchPage = homePage.doSearch(prop.getProperty("searchItem"));

    }
    @Test(priority = 1)
    public void verifySearchPageNameTest() {
        Assert.assertEquals(searchPage.getSearchPageName(), Constants.SEARCHPAGE_NAME);
    }
    @Test(priority = 2)
    public void verifyManufactureDropDownListTest() {
        Assert.assertTrue(searchPage.verifyManufactureDropDownList());
    }

    @Test(priority = 3)
    public void validateCategoryListTest() {
        Assert.assertEquals(searchPage.getCategoriesItem(),Constants.actualCategoryList());
    }
}
