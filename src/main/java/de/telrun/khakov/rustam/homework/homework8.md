## Уровень 1
1. В чем концептуальная разница между LinkedList и ArrayList?
2. Для каких задач лучше выбрать LinkedList, а когда ArrayList?
3. Реализуйте методы у  `MyArrayList`
* size()
* isEmpty()
* iterator()
* clear()
* get(int)
* set(int, Integer)
* contains(Object)
* indexOf(Object)
* lastIndexOf(Object)
* add(Integer)
## Уровень 2
1. Реализуйте методы у MyArrayList
* remove(Object)
* remove(int)
* add(int, Integer)
2. Если есть желание на данном этапе писать реализацию, то реализуйте какие-нибудь другие методы у MyArrayList

3. Если на данный момент есть еще желание понять как работает LinkedList можете реализовать методы у MyList на строке 170 класса MyList описано условие:
* findNodeByIndex(int) - сделать поиск с конца, если индекс находится во второй половине списка
* descendingIterator() - итератор из конца в начало
* listIterator() - итератор с дополнительной сылкой на предыдущий
* toArray() - перевести в массив
* containsAll(Collection) - проверить содержатся ли все
* removeAll(Collection) - удалить все которые содержатся в коллекции
* lastIndexOf(Object)  - последний индекс входного элемента (идеально пожходит итератор с конца в начало)
## Уровень 3
Если предыдущие показались легкими и/или хочется копнуть чутка глубже, то можете в MyList

* subList(int, int) - вернуть новый майлист который будет обрезан
* addAll(int, Collection) - добавить все начиная с какого-то индекса
* retainAll(Collection) - удалить все что не содержится во входной коллекции