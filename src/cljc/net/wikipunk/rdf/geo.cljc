(ns net.wikipunk.rdf.geo
  ^{:base       "http://www.opengis.net/ont/geosparql#",
    :namespaces {"dcterms" "http://purl.org/dc/terms/",
                 "geo"     "http://www.opengis.net/ont/geosparql#",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "schema"  "https://schema.org/",
                 "skos"    "http://www.w3.org/2004/02/skos/core#",
                 "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "geo",
    :source     "http://www.opengis.net/ont/geosparql#"}
  {:dcterms/contributor
   #{{:rdf/type           :schema/Person,
      :schema/affiliation "Geoscape Australia",
      :schema/email       {:xsd/anyURI "joseph.abhayaratna@geoscape.com.au"},
      :schema/name        "Joseph Abhayaratna",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0001-5075-6234"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation #{"Australian National University"
                            "SURROUND Australia Pty Ltd"},
      :schema/email       {:xsd/anyURI "nicholas.car@surroundaustralia.com"},
      :schema/name        "Nicholas J. Car",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-8742-7730"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Oracle Corporation",
      :schema/email       {:xsd/anyURI "matthew.perry@oracle.com"},
      :schema/name        "Matthew Perry",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0003-1988-462X"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation #{"Neanex Technologies" "KU Leuven"},
      :schema/email       {:xsd/anyURI "mathias.bonduel@neanex.com"},
      :schema/name        "Mathias Bonduel",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-3313-924X"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Oracle Corporation",
      :schema/email       {:xsd/anyURI "john.herring@oracle.com"},
      :schema/name        "John Herring"}
     {:rdf/type     :schema/Person,
      :schema/email {:xsd/anyURI "fjknibbe@gmail.com"},
      :schema/name  "Frans Knibbe",
      :schema/url   {:xsd/anyURI "https://orcid.org/0000-0003-3789-2260"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "CSIRO Australia",
      :schema/email       {:xsd/anyURI "simon.cox@csiro.au"},
      :schema/name        "Simon J D Cox",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-3884-3420"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Mainz University Of Applied Sciences",
      :schema/email       {:xsd/anyURI "timo.homburg@hs-mainz.de"},
      :schema/name        "Timo Homburg",
      :schema/url         {:xsd/anyURI
                           "https://orcid.org/0000-0002-9499-5840"}}},
   :dcterms/created {:rdf/type  :xsd/date,
                     :rdf/value "2020-09-09"},
   :dcterms/creator {:rdf/value "OGC GeoSPARQL Standards Working Group"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "An RDF/OWL vocabulary for representing spatial information"},
   :dcterms/license {:xsd/anyURI "https://www.ogc.org/license"},
   :dcterms/modified {:rdf/type  :xsd/date,
                      :rdf/value "2021-10-27"},
   :dcterms/publisher {:rdf/type    :schema/Organization,
                       :schema/name "Open Geospatial Consortium",
                       :schema/url  {:xsd/anyURI "https://www.ogc.org"}},
   :dcterms/replaces {:xsd/anyURI "http://www.opengis.net/ont/geosparql/1.0"},
   :dcterms/rights "(c) 2021 Open Geospatial Consortium",
   :dcterms/source
   #{{:xsd/anyURI "http://www.opengis.net/doc/IS/geosparql/1.1"}
     {:rdf/language "en",
      :rdf/value
      "OGC GeoSPARQL - A Geographic Query Language for RDF Data OGC 11-052r5"}},
   :dcterms/title "GeoSPARQL Ontology",
   :owl/versionIRI {:xsd/anyURI "http://www.opengis.net/ont/geosparql/1.1"},
   :owl/versionInfo "OGC GeoSPARQL 1.1",
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "http://www.opengis.net/doc/IS/geosparql/1.1"},
   :xsd/anyURI "http://www.opengis.net/ont/geosparql"})

(def Feature
  {:db/ident :geo/Feature,
   :owl/disjointWith :geo/Geometry,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/core/feature-class"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/core/feature-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subClassOf :geo/SpatialObject,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A discrete spatial phenomenon in a universe of discourse."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.7"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.9"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.8"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.6"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.5"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.1"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.2"}},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "A Feature represents a uniquely identifiable phenomenon, for example a river or an apple. While such phenomena (and therefore the Features used to represent them) are bounded, their boundaries may be crisp (e.g., the declared boundaries of a state), vague (e.g., the delineation of a valley versus its neighboring mountains), and change with time (e.g., a storm front). While discrete in nature, Features may be created from continuous observations, such as an isochrone that determines the region that can be reached by ambulance within 5 minutes."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Feature"}})

(def FeatureCollection
  {:db/ident :geo/FeatureCollection,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/core/feature-collection-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subClassOf #{:geo/SpatialObjectCollection
                      {:owl/allValuesFrom :geo/Feature,
                       :owl/onProperty    :rdfs/member,
                       :rdf/type          :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A collection of individual Features."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.6"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Feature Collection"}})

(def Geometry
  {:db/ident :geo/Geometry,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-class"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subClassOf :geo/SpatialObject,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A coherent set of direct positions in space. The positions are held within a Spatial Reference System (SRS)."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.8"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.6"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.5"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.1"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.2"}},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Geometry can be used as a representation of the shape, extent or location of a Feature and may exist as a self-contained entity."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Geometry"}})

(def GeometryCollection
  {:db/ident :geo/GeometryCollection,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/core/geometry-collection-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subClassOf #{:geo/SpatialObjectCollection
                      {:owl/allValuesFrom :geo/Geometry,
                       :owl/onProperty    :rdfs/member,
                       :rdf/type          :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A collection of individual Geometries."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.7"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Geometry Collection"}})

(def SpatialObject
  {:db/ident :geo/SpatialObject,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/core/spatial-object-class"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/core/spatial-object-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Anything spatial (being or having a shape, position or an extent)."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.1.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.1.1"}},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Subclasses of this class are expected to be used for instance data."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Spatial Object"}})

(def SpatialObjectCollection
  {:db/ident :geo/SpatialObjectCollection,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/core/spatial-object-collection-class"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subClassOf #{{:owl/allValuesFrom :geo/SpatialObject,
                       :owl/onProperty    :rdfs/member,
                       :rdf/type          :owl/Restriction} :rdfs/Container},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A collection of individual Spatial Objects."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "This is the superclass of Feature Collection and Geometry Collection."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Spatial Object Collection"}})

(def asDGGS
  {:db/ident :geo/asDGGS,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-as-dggs-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/dggsLiteral,
   :rdfs/subPropertyOf :geo/hasSerialization,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Discrete Global Grid System (DGGS) serialization of a Geometry"},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "as DGGS"}})

(def asGML
  {:db/ident :geo/asGML,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-as-gml-literal"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-as-gml-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/gmlLiteral,
   :rdfs/subPropertyOf :geo/hasSerialization,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The GML serialization of a Geometry"},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "as GML"}})

(def asGeoJSON
  {:db/ident :geo/asGeoJSON,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-as-geojson-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/geoJSONLiteral,
   :rdfs/seeAlso {:xsd/anyURI "https://tools.ietf.org/html/rfc7946"},
   :rdfs/subPropertyOf :geo/hasSerialization,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The GeoJSON serialization of a Geometry"},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "as GeoJSON"}})

(def asKML
  {:db/ident :geo/asKML,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-as-kml-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/kmlLiteral,
   :rdfs/seeAlso {:xsd/anyURI "https://www.ogc.org/standards/kml"},
   :rdfs/subPropertyOf :geo/hasSerialization,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The KML serialization of a Geometry"},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "as KML"}})

(def asWKT
  {:db/ident :geo/asWKT,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-as-wkt-literal"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-as-wkt-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/wktLiteral,
   :rdfs/subPropertyOf :geo/hasSerialization,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The WKT serialization of a Geometry"},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.8"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.6"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.2.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.5"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.2.1"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.1"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.2"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "as WKT"}})

(def coordinateDimension
  {:db/ident :geo/coordinateDimension,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of measurements or axes needed to describe the position of this Geometry in a coordinate system."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "coordinate dimension"}})

(def defaultGeometry
  {:db/ident :geo/defaultGeometry,
   :owl/equivalentProperty :geo/hasDefaultGeometry,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Feature,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/Geometry,
   :rdfs/subPropertyOf :geo/hasGeometry,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The default Geometry to be used in spatial calculations. It is usually the most detailed Geometry."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.2.1"}},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Duplicate properties defaultGeometry and hasDefaultGeometry exist because of an inconsistency between ontology and documentation in GeoSPARQL 1.0. Only hasDefaultGeometry is described in the documention."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "default geometry"}})

(def dggsLiteral
  {:db/ident :geo/dggsLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/dggs-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/seeAlso {:xsd/anyURI "http://www.opengis.net/doc/AS/dggs/2.0"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual serialization of a Discrete Global Grid (DGGS) Geometry object."},
   :skos/example
   #{" \"<https://w3id.org/dggs/auspix> OrdinateList (R3234)\"^^<http://www.opengis.net/ont/geosparql#dggsLiteral>"
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "DGGS Literal"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "This datatype is not expected to be used directly but to serve as an abstract datatype for a series of specific DGGS literal types, for specific DGGS implementations"}})

(def dimension
  {:db/ident :geo/dimension,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The topological dimension of this geometric object, which must be less than or equal to the coordinate dimension. In non-homogeneous collections, this will return the largest topological dimension of the contained objects."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "dimension"}})

(def ehContains
  {:db/ident :geo/ehContains,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially contains the object SpatialObject. DE-9IM: T*TFF*FF*"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "contains"}})

(def ehCoveredBy
  {:db/ident :geo/ehCoveredBy,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially covered by the object SpatialObject. DE-9IM: TFF*TFT**"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "covered by"}})

(def ehCovers
  {:db/ident :geo/ehCovers,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially covers the object SpatialObject. DE-9IM: T*TFT*FF*"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "covers"}})

(def ehDisjoint
  {:db/ident :geo/ehDisjoint,
   :owl/equivalentProperty :geo/sfDisjoint,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially disjoint from the object SpatialObject. DE-9IM: FF*FF****"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "disjoint"}})

(def ehEquals
  {:db/ident :geo/ehEquals,
   :owl/equivalentProperty :geo/sfEquals,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially equals the object SpatialObject. DE-9IM: TFFFTFFFT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "equals"}})

(def ehInside
  {:db/ident :geo/ehInside,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially inside the object SpatialObject. DE-9IM: TFF*FFT**"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "inside"}})

(def ehMeet
  {:db/ident :geo/ehMeet,
   :owl/equivalentProperty :geo/sfTouches,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially meets the object SpatialObject. DE-9IM: FT******* ^ F**T***** ^ F***T****"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "meet"}})

(def ehOverlap
  {:db/ident :geo/ehOverlap,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/eh-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially overlaps the object SpatialObject. DE-9IM: T*T***T**"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "overlap"}})

(def geoJSONLiteral
  {:db/ident :geo/geoJSONLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geojson-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/seeAlso {:xsd/anyURI "https://tools.ietf.org/html/rfc7946"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A GeoJSON serialization of a Geometry object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "GeoJSON Literal"}})

(def gmlLiteral
  {:db/ident :geo/gmlLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/gml-literal"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/gml-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://portal.ogc.org/files/?artifact_id=20509"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A GML serialization of a Geometry object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "GML Literal"}})

(def hasArea
  {:db/ident :geo/hasArea,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subPropertyOf :geo/hasSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The area of a Spatial Object."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has area"}})

(def hasBoundingBox
  {:db/ident :geo/hasBoundingBox,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Feature,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/Geometry,
   :rdfs/subPropertyOf :geo/hasGeometry,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The minimum or smallest bounding or enclosing box of a given Feature."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has bounding box"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The target is a Geometry that defines a rectilinear region whose edges are aligned with the axes of the coordinate reference system, which exactly contains the Feature, for example an instance of http://www.opengis.net/ont/sf#envelope."}})

(def hasCentroid
  {:db/ident :geo/hasCentroid,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Feature,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/Geometry,
   :rdfs/subPropertyOf :geo/hasGeometry,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The arithmetic mean position of all the Geometry points of a given Feature."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has centroid"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The target Geometry shall describe a point, for example an instance of http://www.opengis.net/ont/sf#Point."}})

(def hasDefaultGeometry
  {:db/ident :geo/hasDefaultGeometry,
   :owl/equivalentProperty :geo/defaultGeometry,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Feature,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/Geometry,
   :rdfs/subPropertyOf :geo/hasGeometry,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The default Geometry to be used in spatial calculations. It is usually the most detailed Geometry."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Duplicate properties defaultGeometry and hasDefaultGeometry exist because of an inconsistency between ontology and documentation in GeoSPARQL 1.0. Only hasDefaultGeometry is described in the documention."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has default geometry"}})

(def hasGeometry
  {:db/ident :geo/hasGeometry,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Feature,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/Geometry,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A spatial representation for a given Feature."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.8"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.6"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.5"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.2"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has geometry"}})

(def hasLength
  {:db/ident :geo/hasLength,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subPropertyOf :geo/hasSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The length of a Spatial Object."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.7"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has length"}})

(def hasMetricArea
  {:db/ident :geo/hasMetricArea,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :geo/hasMetricSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The area of a Spatial Object in square meters."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.9"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.3.3"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.3"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has area in square meters"}})

(def hasMetricLength
  {:db/ident :geo/hasMetricLength,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :geo/hasMetricSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The length of a Spatial Object in meters."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has length in meters"}})

(def hasMetricPerimeterLength
  {:db/ident :geo/hasMetricPerimeterLength,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :geo/hasMetricSize,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The length of the perimeter of a Spatial Object in meters."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.1.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has perimeter length in meters"}})

(def hasMetricSize
  {:db/ident :geo/hasMetricSize,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subproperties of this property are used to indicate the size of a Spatial Object, as a measurement or estimate of one or more dimensions of the Spatial Object's spatial presence. Units are always metric (meter, square meter or cubic meter)."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has metric size"}})

(def hasMetricSpatialAccuracy
  {:db/ident :geo/hasMetricSpatialAccuracy,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The positional accuracy of the coordinates of a Geometry in meters."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Spatial accuracy is applicable when a Geometry is used to represent a Feature. It is expressed as a distance that indicates the truthfullness of the positions (coordinates) that define the Geometry. In this case accuracy defines a zone surrounding each coordinate within wich the real positions are known to be. The accuracy value defines this zone as a distance from the coordinate(s) in all directions (e.g. a line, a circle or a sphere, depending on spatial dimension)."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has spatial accuracy in meters"}})

(def hasMetricSpatialResolution
  {:db/ident :geo/hasMetricSpatialResolution,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The spatial resolution of a Geometry in meters."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.6"}},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Spatial resolution specifies the level of detail of a Geometry. It the smallest dinstinguishable distance between spatially adjacent coordinates."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has spatial resolution in meters"}})

(def hasMetricVolume
  {:db/ident :geo/hasMetricVolume,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/double,
   :rdfs/subPropertyOf :geo/hasMetricSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The volume of a Spatial Object in cubic meters."},
   :skos/example
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.2.9"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"}},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has volume in cubic meters"}})

(def hasPerimeterLength
  {:db/ident :geo/hasPerimeterLength,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subPropertyOf :geo/hasSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The length of the perimeter of a Spatial Object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.1.1.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has perimeter length"}})

(def hasSerialization
  {:db/ident :geo/hasSerialization,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :rdfs/Literal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Connects a Geometry object with its text-based serialization."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has serialization"}})

(def hasSize
  {:db/ident :geo/hasSize,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/spatial-object-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Subproperties of this property are used to indicate the size of a Spatial Object as a measurement or estimate of one or more dimensions of the Spatial Object's spatial presence."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The recommended way to specify size is by using a subproperty of hasMetricSize. Subproperties of hasSize can be used if more complex expressions are necessary, for example if the unit of length can not be converted to meter, or if additional data are needed to describe the measurement or estimate."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has size"}})

(def hasSpatialAccuracy
  {:db/ident :geo/hasSpatialAccuracy,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The positional accuracy of the coordinates of a Geometry."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Spatial accuracy is applicable when a Geometry is used to represent a Feature. It is expressed as a distance that indicates the truthfullness of the positions (coordinates) that define the Geometry. In this case accuracy defines a zone surrounding each coordinate within wich the real positions are known to be. The accuracy value defines this zone as a distance from the coordinate(s) in all directions (e.g. a line, a circle or a sphere, depending on spatial dimension)."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has spatial accuracy"}})

(def hasSpatialResolution
  {:db/ident :geo/hasSpatialResolution,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/feature-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The spatial resolution of a Geometry."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Spatial resolution specifies the level of detail of a Geometry. It the smallest distinguishable distance between spatially adjacent coordinates."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has spatial resolution"}})

(def hasVolume
  {:db/ident :geo/hasVolume,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/spatial-object-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/subPropertyOf :geo/hasSize,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The volume of a three-dimensional Spatial Object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "has volume"}})

(def isEmpty
  {:db/ident :geo/isEmpty,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "(true) if this geometric object is the empty Geometry. If true, then this geometric object represents the empty point set for the coordinate space."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "is empty"}})

(def isSimple
  {:db/ident :geo/isSimple,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/boolean,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://portal.ogc.org/files/?artifact_id=25355"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "(true) if this geometric object has no anomalous geometric points, such as self intersection or self tangency."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "is simple"}})

(def kmlLiteral
  {:db/ident :geo/kmlLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/kml-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.ogc.org/standards/kml/"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A KML serialization of a Geometry object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.4"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "KML Literal"}})

(def rcc8dc
  {:db/ident :geo/rcc8dc,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially disjoint from the object SpatialObject. DE-9IM: FFTFFTTTT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "disconnected"}})

(def rcc8ec
  {:db/ident :geo/rcc8ec,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially meets the object SpatialObject. DE-9IM: FFTFTTTTT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "externally connected"}})

(def rcc8eq
  {:db/ident :geo/rcc8eq,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially equals the object SpatialObject. DE-9IM: TFFFTFFFT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "equals"}})

(def rcc8ntpp
  {:db/ident :geo/rcc8ntpp,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially inside the object SpatialObject. DE-9IM: TFFTFFTTT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "non-tangential proper part"}})

(def rcc8ntppi
  {:db/ident :geo/rcc8ntppi,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially contains the object SpatialObject. DE-9IM: TTTFFTFFT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "non-tangential proper part inverse"}})

(def rcc8po
  {:db/ident :geo/rcc8po,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially overlaps the object SpatialObject. DE-9IM: TTTTTTTTT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "partially overlapping"}})

(def rcc8tpp
  {:db/ident :geo/rcc8tpp,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially covered by the object SpatialObject. DE-9IM: TFFTTFTTT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "tangential proper part"}})

(def rcc8tppi
  {:db/ident :geo/rcc8tppi,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially covers the object SpatialObject. DE-9IM: TTTFTTFFT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "tangential proper part inverse"}})

(def sfContains
  {:db/ident :geo/sfContains,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/rcc8-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially contains the object SpatialObject. DE-9IM: T*****FF*"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "contains"}})

(def sfCrosses
  {:db/ident :geo/sfCrosses,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially crosses the object SpatialObject. DE-9IM: T*T******"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "crosses"}})

(def sfDisjoint
  {:db/ident :geo/sfDisjoint,
   :owl/equivalentProperty :geo/ehDisjoint,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially disjoint from the object SpatialObject. DE-9IM: FF*FF****"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "disjoint"}})

(def sfEquals
  {:db/ident :geo/sfEquals,
   :owl/equivalentProperty :geo/ehEquals,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially equals the object SpatialObject. DE-9IM: TFFFTFFFT"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "equals"}})

(def sfIntersects
  {:db/ident :geo/sfIntersects,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is not spatially disjoint from the object SpatialObject. DE-9IM: T******** ^ *T******* ^ ***T***** ^ ****T****"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "intersects"}})

(def sfOverlaps
  {:db/ident :geo/sfOverlaps,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially overlaps the object SpatialObject. DE-9IM: T*T***T**"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "overlaps"}})

(def sfTouches
  {:db/ident :geo/sfTouches,
   :owl/equivalentProperty :geo/ehMeet,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject spatially touches the object SpatialObject. DE-9IM: FT******* ^ F**T***** ^ F***T****"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "touches"}})

(def sfWithin
  {:db/ident :geo/sfWithin,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :geo/SpatialObject,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/topology-vocab-extension/sf-spatial-relations"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :geo/SpatialObject,
   :rdfs/seeAlso {:xsd/anyURI "http://dbpedia.org/resource/DE-9IM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "States that the subject SpatialObject is spatially within the object SpatialObject. DE-9IM: T*F**F***"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "within"}})

(def spatialDimension
  {:db/ident :geo/spatialDimension,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/domain :geo/Geometry,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/geometry-properties"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The number of measurements or axes needed to describe the spatial position of this Geometry in a coordinate system."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.1.2.3"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "spatial dimension"}})

(def wktLiteral
  {:db/ident :geo/wktLiteral,
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.1/req/geometry-extension/wkt-literal"}
     {:xsd/anyURI
      "http://www.opengis.net/spec/geosparql/1.0/req/geometry-extension/wkt-literal"}
     {:xsd/anyURI "http://www.opengis.net/ont/geosparql#"}},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://portal.ogc.org/files/?artifact_id=25355"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A Well-known Text serialization of a Geometry object."},
   :skos/example
   {:xsd/anyURI
    "http://www.opengis.net/spec/geosparql/1.1/specification.html#B.2.2.2"},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Well-known Text Literal"}})

(def urn:uuid:c51116e9-f3c9-53df-99b7-b2eb834852ff
  {:dcterms/contributor
   #{{:rdf/type           :schema/Person,
      :schema/affiliation "Geoscape Australia",
      :schema/email       {:xsd/anyURI "joseph.abhayaratna@geoscape.com.au"},
      :schema/name        "Joseph Abhayaratna",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0001-5075-6234"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation #{"Australian National University"
                            "SURROUND Australia Pty Ltd"},
      :schema/email       {:xsd/anyURI "nicholas.car@surroundaustralia.com"},
      :schema/name        "Nicholas J. Car",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-8742-7730"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Oracle Corporation",
      :schema/email       {:xsd/anyURI "matthew.perry@oracle.com"},
      :schema/name        "Matthew Perry",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0003-1988-462X"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation #{"Neanex Technologies" "KU Leuven"},
      :schema/email       {:xsd/anyURI "mathias.bonduel@neanex.com"},
      :schema/name        "Mathias Bonduel",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-3313-924X"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Oracle Corporation",
      :schema/email       {:xsd/anyURI "john.herring@oracle.com"},
      :schema/name        "John Herring"}
     {:rdf/type     :schema/Person,
      :schema/email {:xsd/anyURI "fjknibbe@gmail.com"},
      :schema/name  "Frans Knibbe",
      :schema/url   {:xsd/anyURI "https://orcid.org/0000-0003-3789-2260"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "CSIRO Australia",
      :schema/email       {:xsd/anyURI "simon.cox@csiro.au"},
      :schema/name        "Simon J D Cox",
      :schema/url         {:xsd/anyURI "https://orcid.org/0000-0002-3884-3420"}}
     {:rdf/type           :schema/Person,
      :schema/affiliation "Mainz University Of Applied Sciences",
      :schema/email       {:xsd/anyURI "timo.homburg@hs-mainz.de"},
      :schema/name        "Timo Homburg",
      :schema/url         {:xsd/anyURI
                           "https://orcid.org/0000-0002-9499-5840"}}},
   :dcterms/created {:rdf/type  :xsd/date,
                     :rdf/value "2020-09-09"},
   :dcterms/creator {:rdf/value "OGC GeoSPARQL Standards Working Group"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "An RDF/OWL vocabulary for representing spatial information"},
   :dcterms/license {:xsd/anyURI "https://www.ogc.org/license"},
   :dcterms/modified {:rdf/type  :xsd/date,
                      :rdf/value "2021-10-27"},
   :dcterms/publisher {:rdf/type    :schema/Organization,
                       :schema/name "Open Geospatial Consortium",
                       :schema/url  {:xsd/anyURI "https://www.ogc.org"}},
   :dcterms/replaces {:xsd/anyURI "http://www.opengis.net/ont/geosparql/1.0"},
   :dcterms/rights "(c) 2021 Open Geospatial Consortium",
   :dcterms/source
   #{{:xsd/anyURI "http://www.opengis.net/doc/IS/geosparql/1.1"}
     {:rdf/language "en",
      :rdf/value
      "OGC GeoSPARQL - A Geographic Query Language for RDF Data OGC 11-052r5"}},
   :dcterms/title "GeoSPARQL Ontology",
   :owl/versionIRI {:xsd/anyURI "http://www.opengis.net/ont/geosparql/1.1"},
   :owl/versionInfo "OGC GeoSPARQL 1.1",
   :rdf/type :owl/Ontology,
   :rdfs/seeAlso {:xsd/anyURI "http://www.opengis.net/doc/IS/geosparql/1.1"},
   :xsd/anyURI "http://www.opengis.net/ont/geosparql"})