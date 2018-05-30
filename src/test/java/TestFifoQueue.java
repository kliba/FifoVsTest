import com.matritellabs.utama.collection.FifoQueue;
import org.junit.Test;
import java.util.ArrayList;


import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestFifoQueue {


    @Test
    public void addTestByObject() {
        FifoQueue queue = new FifoQueue();
        assertTrue(queue.add(new FifoQueue()));
        assertTrue(queue.add("ÖőÚÜű"));
        assertTrue(queue.add(new ArrayList<Integer>()));
        assertTrue(queue.add(new Object()));
    }


    @Test
    public void addTestByNull() {
        FifoQueue queue = new FifoQueue();
        assertFalse(queue.add(null));
    }

    @Test
    public void addTestByPrimitive() {
        FifoQueue queue = new FifoQueue();
        int zero = 0;
        double double1 = 0.12d;
        char character = 'a';
        boolean boo = false;
        assertFalse(queue.add(zero));
        assertFalse(queue.add(double1));
        assertFalse(queue.add(character));
        assertFalse(queue.add(boo));
    }


    @Test
    public void elementTestByObject() {
        FifoQueue queue = new FifoQueue();
        queue.add("ÖőÚÜű");
        queue.add(new Object());
        queue.add(new ArrayList<Double>());
        assertEquals("ÖőÚÜű", queue.element());
        assertEquals("ÖőÚÜű", queue.element());
    }

    @Test
    public void offerTestByObject() {
        FifoQueue queue = new FifoQueue();
        assertTrue(queue.offer(new FifoQueue()));
        assertTrue(queue.offer("ÖőÚÜű"));
        assertTrue(queue.offer(new ArrayList<Integer>()));
        assertTrue(queue.offer(new Object()));
    }

    @Test
    public void offerTestByPrimitive() {
        FifoQueue queue = new FifoQueue();
        int zero = 0;
        double double1 = 0.12d;
        char character = 'a';
        boolean boo = false;
        assertFalse(queue.offer(zero));
        assertFalse(queue.offer(double1));
        assertFalse(queue.offer(character));
        assertFalse(queue.offer(boo));
    }

    @Test
    public void offerTestByNull() {
        FifoQueue queue = new FifoQueue();
        assertFalse(queue.offer(null));
    }

    @Test
    public void peekTestForNull() {
        FifoQueue queue = new FifoQueue();
        assertEquals(null, queue.peek());
    }

    @Test
    public void peekTestByObject() {
        FifoQueue queue = new FifoQueue();
        queue.add("asdf");
        queue.offer("élkj");
        queue.add("béka");
        assertEquals("asdf", queue.peek());
        assertEquals("asdf", queue.element());
    }

    @Test
    public void pollTestForNull() {
        FifoQueue queue = new FifoQueue();
        assertEquals(null, queue.poll());
    }

    @Test
    public void poolTestByObject() {
        FifoQueue queue = new FifoQueue();
        queue.add("asdf");
        queue.offer("élkj");
        queue.add("béka");
        assertEquals("asdf", queue.poll());
        assertEquals("élkj", queue.poll());
    }

}
