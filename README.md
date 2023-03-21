# net.wikipunk/yago
YAGO is a large knowledge base with general knowledge about people,
cities, countries, movies, and organizations. 

## :rdfs/seeAlso
* https://yago-knowledge.org/

## :dev

*NOTE*

Although I have only included the subset of yago4 which have english
wikipedia articles in this repository, it remains a very large
knowledge graph to load into memory. The next step should be to
install this graph into Datomic and automating this workflow continues
to be a work-in-progress.

``` shell
clojure -A:dev
```

``` clojure
(reset)
```

``` clojure
(xt/q (:vocab system)
      '{:find [(sample 10 ?e)]
        :where [[?e :rdf/type :yago/Human]
                [?e :schema/hasOccupation :yago/Actor]
                [?e :schema/nationality :yago/United_States]
                [?e :schema/birthDate ?birth]
                [(> ?birth #inst "1989-01-01")]]})
```

## License
Copyright (c) 2023 Adrian Medina

Permission to use, copy, modify, and/or distribute this software for
any purpose with or without fee is hereby granted, provided that the
above copyright notice and this permission notice appear in all
copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
