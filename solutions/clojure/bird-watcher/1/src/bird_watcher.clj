(ns bird-watcher)

(def last-week 
  '[0 2 5 3 7 8 4]
  )

(defn today [birds]
  (last birds)
  )

(defn inc-bird [birds]
  (update birds (->> birds
                  (count)
                  (dec)) inc)
  )  

(defn day-without-birds? [birds]
  (boolean
    (some zero? birds))
  )

(defn n-days-count [birds n]
  (->> birds
    (take n)
    (reduce +'))
  )

(defn busy-days [birds]
  (->> birds
    (filter #(< 4 %))
    (count))
  )

(defn tuple-differs? [[a b]]
  (not= a b))

(defn only-0-1? [xs]
  (every? #{0 1} xs))

(defn odd-week? [birds]
  (and (only-0-1? birds)
       (every? tuple-differs?
               (partition 2 1 birds))))
