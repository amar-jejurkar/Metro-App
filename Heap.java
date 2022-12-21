import java.util.ArrayList;
import java.util.HashMap;

public class Heap<T extends Comparable<T>> 
{
	ArrayList<T> data = new ArrayList<>();
	HashMap<T, Integer> map = new HashMap<>();

	public void add(T item) 	{
		data.add(item);   
		map.put(item, this.data.size() - 1);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) 
	{
		int pi = (ci - 1) / 2;
		if (isLarger(data.get(ci), data.get(pi)) > 0) 
		{
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private int isLarger(T t, T t2) {
        return 0;
    }

    private void swap(int i, int j) 
	{
		T ith = data.get(i);
		T jth = data.get(j);
		
		data.set(i, jth);
		data.set(j, ith);
		map.put(ith, j);
		map.put(jth, i);
	}

	public void display() 
	{
		System.out.println(data);
	}

	public int size() 
	{
		return this.data.size();
	}

	public boolean isEmpty() 
	{
		return this.size() == 0;
	}

    public Graph_M.DijkstraPair remove() {
        return null;
    }

    public void updatePriority(Graph_M.DijkstraPair gp) {
    }
}