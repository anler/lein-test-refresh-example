(defproject foo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cprop "0.1.11"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.22.0"]
            [lein-cprop "1.0.3"]]
  :jvm-opts ["-server" "-Dconf=.lein-env-default"]
  :profiles {:dev           [:project/dev :profiles/dev]
             :test          [:project/test :profiles/test]
             :project/dev   {:jvm-opts ["-server" "-Dconf=.lein-env-dev"]
                             :cprop    {:config-file ".lein-env-dev"}}
             :project/test  {:jvm-opts ["-server" "-Dconf=.lein-env-test"]
                             :cprop    {:config-file ".lein-env-test"}}
             :profiles/dev  {:db "dev default value"}
             :profiles/test {:db "test default value"}})
