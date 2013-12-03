package org.spacehive.world.resources;

import java.io.Serializable;
import java.util.HashMap;

public class ResourceContainer implements Serializable {
	private static final long serialVersionUID = 1L;

	private class Resource implements Serializable {
		private static final long serialVersionUID = 1L;
		private int count;
		private int max;

		private void checkCount() {
			if (count < 0)
				count = 0;
			if (count > max)
				count = max;
		}

		public Resource(int count, int max) {
			super();
			this.count = count;
			this.max = max;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
			checkCount();
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
			checkCount();
		}

		public void add(int count) {
			this.count += count;
			checkCount();
		}
	}

	private HashMap<String, Resource> storage = new HashMap<>();

	public ResourceContainer() {
		for (String res : ResourceTypes.getResTypes()) {
			storage.put(res, new Resource(0, 0));
		}
	}

	public void setResourceCount(String resource, int count) {
		storage.get(resource).setCount(count);
	}

	public void addResource(String resource, int count) {
		storage.get(resource).add(count);
	}

	public int getResourceCount(String resource) {
		return storage.get(resource).getCount();
	}

	public int getResourceMax(String resource) {
		return storage.get(resource).getMax();
	}

	public void setResourceMax(String resource, int max) {
		storage.get(resource).setMax(max);
	}
}
