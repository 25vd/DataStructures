/**
 * My Tree set class, has various methods for trees
 * 
 * @author Vedant Yadav
 * 
 * @version 12/12/23
 */
public class MyTreeSet<E>
{
    private TreeNode root;
    private int size;
    private TreeDisplay display;
    
    /**
     * Constructor for MyTreeSet class
     */
    public MyTreeSet()
    {
        root = null;
        size = 0;
        display = new TreeDisplay();
        display.setDelay(15);
        display.displayTree(root);
    }

    /**
     * Returns the size
     * 
     * @return size the size
     */
    public int size()
    {
        return size;
    }

    /**
     * Returns whether or not it contains obj
     * 
     * @param obj the object to be checked
     * 
     * @return whether or not obj is contained in the BST
     */
    public boolean contains(Object obj)
    {
        display.displayTree(root);
        return BSTUtilStubb.contain(root,(Comparable)obj,display);
    }

    /**
     * Finds whether or not obj is present in the set, adds it if it isn't
     * 
     * @param obj the object to be added
     * 
     * @return true if obj is not present;
     *         otherwise, false
     */
    public boolean add(E obj)
    {
        display.displayTree(root);
        if (!contains(obj)) 
        {
            root = BSTUtilStubb.insert(root, (Comparable) obj, display);
            size++;
            return true;
        }
        return false;
    }
    
    /**
     * Removes obj if obj is present in the set.
     *
     * @param obj the object to be removed
     * 
     * @return true if obj is in the set;
     *         otherwise, false
     */
    public boolean remove(Object obj)
    {
        display.displayTree(root);
        if(contains(obj))
        {
            root = BSTUtilStubb.delete(root, (Comparable) obj, display);
            size--;
            return true;
        }
        return false;
    }

    /**
     * Converts the root to a string
     * 
     * @return the root converted to a string
     */
    public String toString()
    {
        return toString(root);
    }

    /**
     * Converts a TreeNode to a string
     * 
     * @return the TreeNode converted to a string
     */
    private String toString(TreeNode t)
    {
        if (t == null)
            return " ";
        return toString(t.getLeft()) + t.getValue() + toString(t.getRight());
    }
}

