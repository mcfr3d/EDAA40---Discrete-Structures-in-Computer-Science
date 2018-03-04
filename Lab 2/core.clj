(ns lab2.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn merge 
 [list1 list2]
  (if (first list1)
	(if (first list2) 
		(if (>(first list1)(first list2))
			(cons (first list2) (merge (rest list2) list1))

			(cons (first list1) (merge (rest list1) list2))
)
	list1
)

list2))

(defn mergesort [list] 

	(let [listu (vec list)]
		(if (< (count listu) 2) 

		list
	
	(merge (mergesort (subvec listu 0 (/ (count listu) 2)))
	(mergesort (subvec listu (/ (count listu) 2) (count listu)))

))))

(defn height [tree] 
(if (next tree)
 (+ (apply max (map height (next tree))) 1)

1

))			
