
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListImitationTest {

    @Test
    public void testArrayAddElement() {
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(1);
        array.addElement(2);
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(2));

    }

    @Test
    public void testArrayAddOneMoreElement() {
        Array<Integer> array = new ArrayListImitation<>(2);
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(2));
        Assert.assertThat(array.getElement(2), Is.is(3));

    }

    @Test
    public void testIndexOfElement() {
        //если не найден
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        Assert.assertThat(array.indexOfElement(2), Is.is(1));
        Assert.assertThat(array.indexOfElement(5), Is.is(-1));
    }

    @Test
    public void testIsContain() {
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        Assert.assertTrue(array.isContains(2));
        Assert.assertFalse(array.isContains(5));
    }

    @Test
    public void testRemoveElementByIndex(){
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.removeElementByIndex(0);
        Assert.assertThat(array.getElement(0), Is.is(2));
        Assert.assertThat(array.getElement(1), Is.is(3));
    }

    @Test
    public void testRemoveElement(){
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.removeElement(2);
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(3));
    }

    @Test
    public void testSortBubble(){
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(3);
        array.addElement(2);
        array.addElement(5);
        array.addElement(1);
        array.addElement(4);
        array.sortBubble();
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(2));
        Assert.assertThat(array.getElement(2), Is.is(3));
        Assert.assertThat(array.getElement(3), Is.is(4));
        Assert.assertThat(array.getElement(4), Is.is(5));
    }

    @Test
    public void testSortSelect(){
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(3);
        array.addElement(2);
        array.addElement(5);
        array.addElement(1);
        array.addElement(4);
        array.sortSelect();
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(2));
        Assert.assertThat(array.getElement(2), Is.is(3));
        Assert.assertThat(array.getElement(3), Is.is(4));
        Assert.assertThat(array.getElement(4), Is.is(5));
    }

    @Test
    public void testSortInsert(){
        Array<Integer> array = new ArrayListImitation<>();
        array.addElement(3);
        array.addElement(2);
        array.addElement(5);
        array.addElement(1);
        array.addElement(4);
        array.sortInsert();
        Assert.assertThat(array.getElement(0), Is.is(1));
        Assert.assertThat(array.getElement(1), Is.is(2));
        Assert.assertThat(array.getElement(2), Is.is(3));
        Assert.assertThat(array.getElement(3), Is.is(4));
        Assert.assertThat(array.getElement(4), Is.is(5));
    }

}
