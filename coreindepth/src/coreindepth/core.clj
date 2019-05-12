(ns coreindepth.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn titleize
  "to test if map can treat list, vector, set, map equally!!!"
  [topic]
  (str topic "  for the Brave and True"))

(defn convertmaptoseq
  "To convert a map to a sequence"
  []
  (seq {:name "Bill Compton"}))

(defn convertaseqtoamap
  "To convert a sequence to a map"
  []
  (into {} (seq {:a 1, :c 3, :b 2})))

(def human-consumption [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.2 0.3 1.1])
(defn unify-diet-data
  [human critter]
  {:human human
   :critter critter})

;; (map unify-diet-data human-consumption critter-consumption)

(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))
(defn stats1
  [numbers]
  {:sum (sum numbers)
   :count (count numbers)
   :avg (avg numbers)})

;; To use keyword to get data with map
(def identities 
  [{:alias "Batman" :real "Bruce Wayne"}
   {:alias "Spider-Man" :real "Peter Parker"}
   {:alias "Santa" :real "Your mom"}
   {:alias "Easter" :real "Your dad"}])

;;(map :real identities)

(defn testreducetotransform
  []
  (reduce (fn [new-map [key val]]
            (assoc new-map key (inc val)))
    {}
    {:max 30 :min 10}))

(defn testtake
  []
  (take 3 [1 2 3 4 5 6 7 8 9]))

(defn testdrop
  []
  (drop 3 [1 2 3 4 5 6 7 8 9]))

(def food-journal
  [{:month 1 :day 1 :human 5.3 :critter 2.3}
   {:month 1 :day 2 :human 5.1 :critter 2.0}
   {:month 2 :day 1 :human 4.9 :critter 2.1}
   {:month 2 :day 2 :human 5.0 :critter 2.5}
   {:month 3 :day 1 :human 4.2 :critter 3.3}
   {:month 3 :day 2 :human 4.0 :critter 3.8}
   {:month 4 :day 1 :human 3.7 :critter 3.9}
   {:month 4 :day 2 :human 3.7 :critter 3.6}])  

(defn testtakewhile 
  []
  (take-while #(< (:month %) 3) food-journal))

(defn testdropwhile
  []
  (drop-while #(< (:month %) 3) food-journal))

(defn testfilter
  []
  (filter #(< (:human %) 5) food-journal))

(defn testsome
  []
  (some #(> (:critter %) 5) food-journal))
  
(defn testsome1
  []
  (some #(> (:critter %) 3) food-journal))

(defn testsome2
  []
  (some #(and (> (:critter %) 3) %) food-journal))

(defn testsort
  []
  (sort [3 1 2]))

(defn testsortby
  []
  (sort-by count ["aaa" "c" "bb"]))

(defn testconcat
  []
  (concat [1 2] [3 4]))

(def add10 (partial + 10))



