# net.wikipunk/yago
YAGO 4.5 is the latest version of the YAGO knowledge base. It is based on Wikidata — the largest public general-purpose knowledge base. YAGO refines the data as follows:

1.    All entity identifiers and property identifiers are human-readable.
2.    The top-level classes come from schema.org — a standard repertoire of classes and properties maintained by Google and others. The lower level classes are a careful selection of the Wikidata taxonomy.
3.    The properties come from schema.org.
4.    YAGO 4.5 contains semantic constraints in the form of SHACL. These constraints keep the data clean, and allow for logical reasoning on YAGO. 

YAGO is thus a simplified, cleaned, and “reasonable” version of Wikidata. It contains 49 million entities and 109 million facts.

If you use YAGO 4.5 for scientific purposes, please cite our paper:

>    Fabian M. Suchanek, Mehwish Alam, Thomas Bonald, Pierre-Henri Paris, Jules Soria:
>    Integrating the Wikidata Taxonomy into YAGO
>    Arxiv 2308.11884, 2023 

## :dev

``` shell
clojure -A:dev
```

``` clojure
(reset)
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
