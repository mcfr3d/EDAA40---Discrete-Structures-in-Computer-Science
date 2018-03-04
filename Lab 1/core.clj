(ns scratch.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn fib2 [number] (if (< number 2) 1 (+ (fib2(- number 1)) (fib2(- number 2)))))

(defn fibHelper 
	[n i previous current] 
	(if(== n i) 
		current 
		(fibHelper n (+ i 1N) current (+ previous current))))

(defn fib 
	[n]
	(fibHelper n 0N 0N 1N))

