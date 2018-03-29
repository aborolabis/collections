# Kolekcje

### W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

Na szczycie hierarchii interfejsów znajduje się interface Collection. Pochodnymi interfejsu Collection są:
* List
* Set
    * pochodną jest SortedSet
* Queue
* Deque

Obok tej hierarchii znajduje się Map oraz pochodny SortedMap.

### Jakie są podstawowe implementacje poszczególnych interfejsów?

Podstawowymi inplementacjami interfejsów są:
* List: 
    * AbstractList, 
    * AbstractSequentialList, 
    * **ArrayList**, 
    * AttributeList, 
    * CopyOnWriteArrayList, 
    * **LinkedList**, 
    * RoleList, 
    * RoleUnresolvedList, 
    * Stack, 
    * Vector
    
* Set: 
    * AbstractSet, 
    * ConcurrentHashMap.KeySetView, 
    * ConcurrentSkipListSet, 
    * CopyOnWriteArraySet, 
    * EnumSet, 
    * **HashSet**, 
    * JobStateReasons, 
    * **LinkedHashSet**, 
    * **TreeSet**
    
* Queue:
    * AbstractQueue, 
    * ArrayBlockingQueue, 
    * ArrayDeque, 
    * ConcurrentLinkedDeque, 
    * ConcurrentLinkedQueue, 
    * DelayQueue, 
    * LinkedBlockingDeque, 
    * LinkedBlockingQueue, 
    * **LinkedList**, 
    * LinkedTransferQueue, 
    * PriorityBlockingQueue, 
    * PriorityQueue, 
    * SynchronousQueue
    
* Deque:
    * ArrayDeque, 
    * ConcurrentLinkedDeque, 
    * LinkedBlockingDeque, 
    * **LinkedList**
    
* Map:
    * **HashMap**
    * AbstractMap, 
    * Attributes, 
    * AuthProvider, 
    * ConcurrentHashMap, 
    * ConcurrentSkipListMap, 
    * EnumMap, 
    * Hashtable, 
    * IdentityHashMap, 
    * LinkedHashMap, 
    * PrinterStateReasons, 
    * Properties, 
    * Provider, 
    * RenderingHints, 
    * SimpleBindings, 
    * TabularDataSupport,
    * **TreeMap**
    * UIDefaults, 
    * WeakHashMap
    

### W których kolekcjach elementy są sortowane i w jaki sposób?

Kolekcje, których elementy możemy posortować: 
* ArrayList, LinkedList -  możemy wykorzystać metodę sort i podać opcjonalnie komparator

Kolekcje, które przechowują elementy w sposób posortowany:
* TreeSet - może wykorzystywać naturalny porządek elementów,
* PriorityQueue - naturalny porządek lub komparator,
* LinkedHashSet - przechowuje elementy w kolejności wstawienia,
* TreeMap - posortowane według klucza,
* LinkedHashMap - przechowuje elementy w wstawiania kluczy,

### Implementacje interfejsu List – złożoność operacji

* Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

### Do których kolekcji można wstawiać wartości null?

Miejsce na odpowiedź

### Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

Miejsce na odpowiedź

### Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

Miejsce na odpowiedź