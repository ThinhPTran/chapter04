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
  (reduce (fn [new-map [key value]]
            (assoc new-map key (inc val)))
    {}
    {:max 30 :min 10}))



