package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    @Override
    public boolean add(int value) {
        totalAdded++;
        return super.add(value);
    }

    @Override
public boolean addAll(IntegerList values) {
    int initialSize = this.size();  // Одоогийн жагсаалтын хэмжээг хадгалах
    boolean changed = super.addAll(values);  // Эцэг классын addAll() дуудна
    int newSize = this.size();  // Шинэ хэмжээг авах

    totalAdded += (newSize - initialSize);  // Нэмэгдсэн элементүүдийн тоогоор шинэчлэх
    return changed;
}

    public int getTotalAdded() {
        return totalAdded;
    }
}
