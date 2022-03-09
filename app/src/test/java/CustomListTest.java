import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest
{
    private CustomList list;
    private City dummycity;

    @BeforeEach
    public void createList()
    {
        list = new CustomList(null, new ArrayList<>());
        dummycity = new City("dummycity", "dummyprov");
    }

    @Test
    public void addCityTest()
    {
        int listSize = list.getCount();
        list.addCity(dummycity);
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest()
    {
        assertFalse(list.hasCity(dummycity));
        list.addCity(dummycity);
        assertTrue(list.hasCity(dummycity));
    }



}
