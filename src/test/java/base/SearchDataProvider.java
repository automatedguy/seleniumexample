package base;

import org.testng.annotations.DataProvider;

public class SearchDataProvider {

    @DataProvider(name = "searchPatternDataProvider")
    public Object[][] getSearchPattern(){
        return new Object[][]{{"CNN"},{"ABC"}};
    }
}
