package com.tdl.javafoundations.pizzaapi.test;

import static org.mockito.Mockito.*;

import com.tdl.javafoundations.pizzaapi.Menu;
import com.tdl.javafoundations.pizzaapi.MenuItem;
import com.tdl.javafoundations.pizzaapi.Product;
import java.util.List;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

// questions?
// - what is static import? differences between static and non-static

// notes
// defaults for all mock object methods: false (boolean), 0 (int), empty for collections, null for other objects

public class LenaTest {

    @Mock
            Product mockedProduct2;
    @InjectMocks
            Product getMockedProduct3;

    Product mockedProduct = mock(Product.class);
    MenuItem expected = new MenuItem(mockedProduct, "98");
    Menu mockedMenu = mock(Menu.class);



/*    public void addToTheList() {
        mockedList.add("one");
    }
*/

 /*   public boolean verify(List mockedList) {
        return verify(mockedList).add("two");
    }
*/


}
