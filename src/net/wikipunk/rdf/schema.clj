(ns net.wikipunk.rdf.schema
  "http://schema.org/"
  {:dcat/downloadURL  "resources/yago-wd-schema.nt.gz",
   :rdf/ns-prefix-map {"schema" "http://schema.org/"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "schema",
   :rdfa/uri          "http://schema.org/"})

(def Accommodation
  "An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement. For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies. <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Accommodation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.\nFor more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "accommodation",
   :rdfs/subClassOf :schema/Place})

(def AdministrativeArea
  "A geographical region, typically under the jurisdiction of a particular government."
  {:db/ident :schema/AdministrativeArea,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A geographical region, typically under the jurisdiction of a particular government.",
   :rdfs/label "administrative area",
   :rdfs/subClassOf :schema/Place})

(def Airline
  "An organization that provides flights for passengers."
  {:db/ident        :schema/Airline,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An organization that provides flights for passengers.",
   :rdfs/label      "airline",
   :rdfs/subClassOf :schema/Organization})

(def Airport
  "An airport."
  {:db/ident        :schema/Airport,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An airport.",
   :rdfs/label      "airport",
   :rdfs/subClassOf :schema/CivicStructure})

(def AmusementPark
  "An amusement park."
  {:db/ident        :schema/AmusementPark,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An amusement park.",
   :rdfs/label      "amusement park",
   :rdfs/subClassOf :schema/EntertainmentBusiness})

(def AnatomicalStructure
  "Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures."
  {:db/ident :schema/AnatomicalStructure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.",
   :rdfs/label "anatomical structure",
   :rdfs/subClassOf :schema/MedicalEntity})

(def AnimalShelter
  "Animal shelter."
  {:db/ident        :schema/AnimalShelter,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Animal shelter.",
   :rdfs/label      "animal shelter",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Apartment
  "An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/Apartment\">http://en.wikipedia.org/wiki/Apartment</a>)."
  {:db/ident :schema/Apartment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/Apartment\">http://en.wikipedia.org/wiki/Apartment</a>).",
   :rdfs/label "apartment",
   :rdfs/subClassOf :schema/Accommodation})

(def Aquarium
  "Aquarium."
  {:db/ident        :schema/Aquarium,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Aquarium.",
   :rdfs/label      "aquarium",
   :rdfs/subClassOf :schema/CivicStructure})

(def ArchiveOrganization
  "An organization with archival holdings. An organization which keeps and preserves archival material and typically makes it accessible to the public."
  {:db/ident :schema/ArchiveOrganization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An organization with archival holdings. An organization which keeps and preserves archival material and typically makes it accessible to the public.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "archive organization"},
   :rdfs/subClassOf :schema/LocalBusiness})

(def ArtGallery
  "An art gallery."
  {:db/ident        :schema/ArtGallery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An art gallery.",
   :rdfs/label      "art gallery",
   :rdfs/subClassOf :schema/EntertainmentBusiness})

(def Artery
  "A type of blood vessel that specifically carries blood away from the heart."
  {:db/ident :schema/Artery,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A type of blood vessel that specifically carries blood away from the heart.",
   :rdfs/label "artery",
   :rdfs/subClassOf :schema/Vessel})

(def Article
  "An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.<br/><br/> See also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>."
  {:db/ident :schema/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.<br/><br/>\n\nSee also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>.",
   :rdfs/label "article",
   :rdfs/subClassOf :schema/CreativeWork})

(def Atlas
  "A collection or bound volume of maps, charts, plates or tables, physical or in media form illustrating any subject."
  {:db/ident :schema/Atlas,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A collection or bound volume of maps, charts, plates or tables, physical or in media form illustrating any subject.",
   :rdfs/label "atlas",
   :rdfs/subClassOf :schema/CreativeWork})

(def AudioObject
  "An audio file."
  {:db/ident        :schema/AudioObject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An audio file.",
   :rdfs/label      "audio object",
   :rdfs/subClassOf :schema/MediaObject})

(def AutoRental
  "A car rental business."
  {:db/ident        :schema/AutoRental,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A car rental business.",
   :rdfs/label      "auto rental",
   :rdfs/subClassOf :schema/AutomotiveBusiness})

(def AutomotiveBusiness
  "Car repair, sales, or parts."
  {:db/ident        :schema/AutomotiveBusiness,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Car repair, sales, or parts.",
   :rdfs/label      "automotive business",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Bakery
  "A bakery."
  {:db/ident        :schema/Bakery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bakery.",
   :rdfs/label      "bakery",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def BankOrCreditUnion
  "Bank or credit union."
  {:db/ident        :schema/BankOrCreditUnion,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Bank or credit union.",
   :rdfs/label      "bank or credit union",
   :rdfs/subClassOf :schema/FinancialService})

(def BarOrPub
  "A bar or pub."
  {:db/ident        :schema/BarOrPub,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bar or pub.",
   :rdfs/label      "bar or pub",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def Beach
  "Beach."
  {:db/ident        :schema/Beach,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Beach.",
   :rdfs/label      "beach",
   :rdfs/subClassOf :schema/CivicStructure})

(def BeautySalon
  "Beauty salon."
  {:db/ident        :schema/BeautySalon,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Beauty salon.",
   :rdfs/label      "beauty salon",
   :rdfs/subClassOf :schema/HealthAndBeautyBusiness})

(def BedAndBreakfast
  "Bed and breakfast. <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/BedAndBreakfast,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Bed and breakfast.\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "bed and breakfast",
   :rdfs/subClassOf :schema/LodgingBusiness})

(def Blog
  "A blog."
  {:db/ident        :schema/Blog,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A blog.",
   :rdfs/label      "blog",
   :rdfs/subClassOf :schema/CreativeWork})

(def BlogPosting
  "A blog post."
  {:db/ident        :schema/BlogPosting,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A blog post.",
   :rdfs/label      "blog posting",
   :rdfs/subClassOf :schema/SocialMediaPosting})

(def BloodTest
  "A medical test performed on a sample of a patient's blood."
  {:db/ident :schema/BloodTest,
   :rdf/type :owl/Class,
   :rdfs/comment "A medical test performed on a sample of a patient's blood.",
   :rdfs/label "blood test",
   :rdfs/subClassOf :schema/MedicalTest})

(def BodyOfWater
  "A body of water, such as a sea, ocean, or lake."
  {:db/ident        :schema/BodyOfWater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A body of water, such as a sea, ocean, or lake.",
   :rdfs/label      "body of water",
   :rdfs/subClassOf :schema/Landform})

(def Bone
  "Rigid connective tissue that comprises up the skeletal structure of the human body."
  {:db/ident :schema/Bone,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Rigid connective tissue that comprises up the skeletal structure of the human body.",
   :rdfs/label "bone",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def Book
  "A book."
  {:db/ident        :schema/Book,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A book.",
   :rdfs/label      "book",
   :rdfs/subClassOf :schema/CreativeWork})

(def BookSeries
  "A series of books. Included books can be indicated with the hasPart property."
  {:db/ident :schema/BookSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A series of books. Included books can be indicated with the hasPart property.",
   :rdfs/label "book series",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def BookStore
  "A bookstore."
  {:db/ident        :schema/BookStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bookstore.",
   :rdfs/label      "book store",
   :rdfs/subClassOf :schema/Store})

(def BowlingAlley
  "A bowling alley."
  {:db/ident        :schema/BowlingAlley,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bowling alley.",
   :rdfs/label      "bowling alley",
   :rdfs/subClassOf :schema/SportsActivityLocation})

(def Brand
  "A brand is a name used by an organization or business person for labeling a product, product group, or similar."
  {:db/ident :schema/Brand,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A brand is a name used by an organization or business person for labeling a product, product group, or similar.",
   :rdfs/label "brand",
   :rdfs/subClassOf :schema/Thing})

(def Brewery
  "Brewery."
  {:db/ident        :schema/Brewery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Brewery.",
   :rdfs/label      "brewery",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def Bridge
  "A bridge."
  {:db/ident        :schema/Bridge,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bridge.",
   :rdfs/label      "bridge",
   :rdfs/subClassOf :schema/CivicStructure})

(def BroadcastChannel
  "A unique instance of a BroadcastService on a CableOrSatelliteService lineup."
  {:db/ident :schema/BroadcastChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A unique instance of a BroadcastService on a CableOrSatelliteService lineup.",
   :rdfs/label "broadcast channel",
   :rdfs/subClassOf :schema/Thing})

(def BroadcastService
  "A delivery service through which content is provided via broadcast over the air or online."
  {:db/ident :schema/BroadcastService,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A delivery service through which content is provided via broadcast over the air or online.",
   :rdfs/label "broadcast service",
   :rdfs/subClassOf :schema/Service})

(def BuddhistTemple
  "A Buddhist temple."
  {:db/ident        :schema/BuddhistTemple,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Buddhist temple.",
   :rdfs/label      "buddhist temple",
   :rdfs/subClassOf :schema/PlaceOfWorship})

(def BusOrCoach
  "A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel."
  {:db/ident :schema/BusOrCoach,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.",
   :rdfs/label "bus or coach",
   :rdfs/subClassOf :schema/Vehicle})

(def BusStation
  "A bus station."
  {:db/ident        :schema/BusStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bus station.",
   :rdfs/label      "bus station",
   :rdfs/subClassOf :schema/CivicStructure})

(def BusStop
  "A bus stop."
  {:db/ident        :schema/BusStop,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bus stop.",
   :rdfs/label      "bus stop",
   :rdfs/subClassOf :schema/CivicStructure})

(def CafeOrCoffeeShop
  "A cafe or coffee shop."
  {:db/ident        :schema/CafeOrCoffeeShop,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A cafe or coffee shop.",
   :rdfs/label      "cafe or coffee shop",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def Campground
  "A camping site, campsite, or <a class=\"localLink\" href=\"http://schema.org/Campground\">Campground</a> is a place used for overnight stay in the outdoors, typically containing individual <a class=\"localLink\" href=\"http://schema.org/CampingPitch\">CampingPitch</a> locations. <br/><br/> In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or park a camper; a campground may contain many campsites (Source: Wikipedia see <a href=\"https://en.wikipedia.org/wiki/Campsite\">https://en.wikipedia.org/wiki/Campsite</a>).<br/><br/> See also the dedicated <a href=\"/docs/hotels.html\">document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Campground,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A camping site, campsite, or <a class=\"localLink\" href=\"http://schema.org/Campground\">Campground</a> is a place used for overnight stay in the outdoors, typically containing individual <a class=\"localLink\" href=\"http://schema.org/CampingPitch\">CampingPitch</a> locations. <br/><br/>\n\nIn British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or park a camper; a campground may contain many campsites (Source: Wikipedia see <a href=\"https://en.wikipedia.org/wiki/Campsite\">https://en.wikipedia.org/wiki/Campsite</a>).<br/><br/>\n\nSee also the dedicated <a href=\"/docs/hotels.html\">document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "campground",
   :rdfs/subClassOf [:schema/CivicStructure :schema/LodgingBusiness]})

(def Canal
  "A canal, like the Panama Canal."
  {:db/ident        :schema/Canal,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A canal, like the Panama Canal.",
   :rdfs/label      "canal",
   :rdfs/subClassOf :schema/BodyOfWater})

(def Car
  "A car is a wheeled, self-powered motor vehicle used for transportation."
  {:db/ident :schema/Car,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A car is a wheeled, self-powered motor vehicle used for transportation.",
   :rdfs/label "car",
   :rdfs/subClassOf :schema/Vehicle})

(def Casino
  "A casino."
  {:db/ident        :schema/Casino,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A casino.",
   :rdfs/label      "casino",
   :rdfs/subClassOf :schema/EntertainmentBusiness})

(def CatholicChurch
  "A Catholic church."
  {:db/ident        :schema/CatholicChurch,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Catholic church.",
   :rdfs/label      "catholic church",
   :rdfs/subClassOf :schema/Church})

(def Cemetery
  "A graveyard."
  {:db/ident        :schema/Cemetery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A graveyard.",
   :rdfs/label      "cemetery",
   :rdfs/subClassOf :schema/CivicStructure})

(def Chapter
  "One of the sections into which a book is divided. A chapter usually has a section number or a name."
  {:db/ident :schema/Chapter,
   :rdf/type :owl/Class,
   :rdfs/comment
   "One of the sections into which a book is divided. A chapter usually has a section number or a name.",
   :rdfs/label "chapter",
   :rdfs/subClassOf :schema/CreativeWork})

(def ChildCare
  "A Childcare center."
  {:db/ident        :schema/ChildCare,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Childcare center.",
   :rdfs/label      "child care",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Church
  "A church."
  {:db/ident        :schema/Church,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A church.",
   :rdfs/label      "church",
   :rdfs/subClassOf :schema/PlaceOfWorship})

(def City
  "A city or town."
  {:db/ident        :schema/City,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A city or town.",
   :rdfs/label      "city",
   :rdfs/subClassOf :schema/AdministrativeArea})

(def CityHall
  "A city hall."
  {:db/ident        :schema/CityHall,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A city hall.",
   :rdfs/label      "city hall",
   :rdfs/subClassOf :schema/GovernmentBuilding})

(def CivicStructure
  "A public structure, such as a town hall or concert hall."
  {:db/ident        :schema/CivicStructure,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A public structure, such as a town hall or concert hall.",
   :rdfs/label      "civic structure",
   :rdfs/subClassOf :schema/Place})

(def Collection
  "A collection of items e.g. creative works or products."
  {:db/ident        :schema/Collection,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A collection of items e.g. creative works or products.",
   :rdfs/label      "collection",
   :rdfs/subClassOf :schema/CreativeWork})

(def CollegeOrUniversity
  "A college, university, or other third-level educational institution."
  {:db/ident :schema/CollegeOrUniversity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A college, university, or other third-level educational institution.",
   :rdfs/label "college or university",
   :rdfs/subClassOf :schema/EducationalOrganization})

(def ComedyClub
  "A comedy club."
  {:db/ident        :schema/ComedyClub,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A comedy club.",
   :rdfs/label      "comedy club",
   :rdfs/subClassOf :schema/EntertainmentBusiness})

(def ComicSeries
  "A sequential publication of comic stories under a unifying title, for example \"The Amazing Spider-Man\" or \"Groo the Wanderer\"."
  {:db/ident :schema/ComicSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A sequential publication of comic stories under a\n        unifying title, for example \"The Amazing Spider-Man\" or \"Groo the\n        Wanderer\".",
   :rdfs/label "comic series",
   :rdfs/subClassOf :schema/Periodical})

(def ComicStory
  "The term \"story\" is any indivisible, re-printable unit of a comic, including the interior stories, covers, and backmatter. Most comics have at least two stories: a cover (ComicCoverArt) and an interior story."
  {:db/ident :schema/ComicStory,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The term \"story\" is any indivisible, re-printable\n        unit of a comic, including the interior stories, covers, and backmatter. Most\n        comics have at least two stories: a cover (ComicCoverArt) and an interior story.",
   :rdfs/label "comic story",
   :rdfs/subClassOf :schema/CreativeWork})

(def ComputerLanguage
  "This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the <a class=\"localLink\" href=\"http://schema.org/Language\">Language</a> type."
  {:db/ident :schema/ComputerLanguage,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This type covers computer programming languages such as Scheme and Lisp, as well as other language-like computer representations. Natural languages are best represented with the <a class=\"localLink\" href=\"http://schema.org/Language\">Language</a> type.",
   :rdfs/label "computer language",
   :rdfs/subClassOf :schema/Thing})

(def Continent
  "One of the continents (for example, Europe or Africa)."
  {:db/ident        :schema/Continent,
   :rdf/type        :owl/Class,
   :rdfs/comment    "One of the continents (for example, Europe or Africa).",
   :rdfs/label      "continent",
   :rdfs/subClassOf :schema/Landform})

(def Corporation
  "Organization: A business corporation."
  {:db/ident        :schema/Corporation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Organization: A business corporation.",
   :rdfs/label      "corporation",
   :rdfs/subClassOf :schema/Organization})

(def Country
  "A country."
  {:db/ident        :schema/Country,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A country.",
   :rdfs/label      "country",
   :rdfs/subClassOf :schema/AdministrativeArea})

(def Course
  "A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners."
  {:db/ident :schema/Course,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.",
   :rdfs/label "course",
   :rdfs/subClassOf [:schema/CreativeWork :schema/LearningResource]})

(def Courthouse
  "A courthouse."
  {:db/ident        :schema/Courthouse,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A courthouse.",
   :rdfs/label      "courthouse",
   :rdfs/subClassOf :schema/GovernmentBuilding})

(def CreativeWork
  "The most generic kind of creative work, including books, movies, photographs, software programs, etc."
  {:db/ident :schema/CreativeWork,
   :owl/disjointWith
   [:schema/Organization :schema/Event :schema/Place :schema/Person],
   :rdf/type :owl/Class,
   :rdfs/comment
   "The most generic kind of creative work, including books, movies, photographs, software programs, etc.",
   :rdfs/label "creative work",
   :rdfs/subClassOf :schema/Thing})

(def CreativeWorkSeason
  "A media season e.g. tv, radio, video game etc."
  {:db/ident        :schema/CreativeWorkSeason,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A media season e.g. tv, radio, video game etc.",
   :rdfs/label      "creative work season",
   :rdfs/subClassOf :schema/CreativeWork})

(def CreativeWorkSeries
  "A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike <a class=\"localLink\" href=\"http://schema.org/ItemList\">ItemList</a> which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).<br/><br/> Specific subtypes are available for describing <a class=\"localLink\" href=\"http://schema.org/TVSeries\">TVSeries</a>, <a class=\"localLink\" href=\"http://schema.org/RadioSeries\">RadioSeries</a>, <a class=\"localLink\" href=\"http://schema.org/MovieSeries\">MovieSeries</a>, <a class=\"localLink\" href=\"http://schema.org/BookSeries\">BookSeries</a>, <a class=\"localLink\" href=\"http://schema.org/Periodical\">Periodical</a> and <a class=\"localLink\" href=\"http://schema.org/VideoGameSeries\">VideoGameSeries</a>. In each case, the <a class=\"localLink\" href=\"http://schema.org/hasPart\">hasPart</a> / <a class=\"localLink\" href=\"http://schema.org/isPartOf\">isPartOf</a> properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.<br/><br/> It is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate."
  {:db/ident :schema/CreativeWorkSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike <a class=\"localLink\" href=\"http://schema.org/ItemList\">ItemList</a> which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).<br/><br/>\n\nSpecific subtypes are available for describing <a class=\"localLink\" href=\"http://schema.org/TVSeries\">TVSeries</a>, <a class=\"localLink\" href=\"http://schema.org/RadioSeries\">RadioSeries</a>, <a class=\"localLink\" href=\"http://schema.org/MovieSeries\">MovieSeries</a>, <a class=\"localLink\" href=\"http://schema.org/BookSeries\">BookSeries</a>, <a class=\"localLink\" href=\"http://schema.org/Periodical\">Periodical</a> and <a class=\"localLink\" href=\"http://schema.org/VideoGameSeries\">VideoGameSeries</a>. In each case, the <a class=\"localLink\" href=\"http://schema.org/hasPart\">hasPart</a> / <a class=\"localLink\" href=\"http://schema.org/isPartOf\">isPartOf</a> properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.<br/><br/>\n\nIt is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate.",
   :rdfs/label "creative work series",
   :rdfs/subClassOf :schema/CreativeWork})

(def Crematorium
  "A crematorium."
  {:db/ident        :schema/Crematorium,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A crematorium.",
   :rdfs/label      "crematorium",
   :rdfs/subClassOf :schema/CivicStructure})

(def DanceGroup
  "A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance."
  {:db/ident :schema/DanceGroup,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.",
   :rdfs/label "dance group",
   :rdfs/subClassOf :schema/PerformingGroup})

(def DataCatalog
  "A collection of datasets."
  {:db/ident        :schema/DataCatalog,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A collection of datasets.",
   :rdfs/label      "data catalog",
   :rdfs/subClassOf :schema/CreativeWork})

(def Dataset
  "A body of structured information describing some topic(s) of interest."
  {:db/ident :schema/Dataset,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A body of structured information describing some topic(s) of interest.",
   :rdfs/label "dataset",
   :rdfs/subClassOf :schema/CreativeWork})

(def DaySpa
  "A day spa."
  {:db/ident        :schema/DaySpa,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A day spa.",
   :rdfs/label      "day spa",
   :rdfs/subClassOf :schema/HealthAndBeautyBusiness})

(def DefenceEstablishment
  "A defence establishment, such as an army or navy base."
  {:db/ident        :schema/DefenceEstablishment,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A defence establishment, such as an army or navy base.",
   :rdfs/label      "defence establishment",
   :rdfs/subClassOf :schema/GovernmentBuilding})

(def DiagnosticProcedure
  "A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes."
  {:db/ident :schema/DiagnosticProcedure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A medical procedure intended primarily for diagnostic, as opposed to therapeutic, purposes.",
   :rdfs/label "diagnostic procedure",
   :rdfs/subClassOf :schema/MedicalProcedure})

(def Distillery
  "A distillery."
  {:db/ident        :schema/Distillery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A distillery.",
   :rdfs/label      "distillery",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def Drawing
  "A picture or diagram made with a pencil, pen, or crayon rather than paint."
  {:db/ident :schema/Drawing,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A picture or diagram made with a pencil, pen, or crayon rather than paint.",
   :rdfs/label "drawing",
   :rdfs/subClassOf :schema/CreativeWork})

(def Drug
  "A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them."
  {:db/ident :schema/Drug,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A chemical or biologic substance, used as a medical therapy, that has a physiological effect on an organism. Here the term drug is used interchangeably with the term medicine although clinical knowledge make a clear difference between them.",
   :rdfs/label "drug",
   :rdfs/subClassOf :schema/Substance})

(def DrugLegalStatus
  "The legal availability status of a medical drug."
  {:db/ident        :schema/DrugLegalStatus,
   :rdf/type        :owl/Class,
   :rdfs/comment    "The legal availability status of a medical drug.",
   :rdfs/label      "drug legal status",
   :rdfs/subClassOf :schema/MedicalEntity})

(def EducationalOrganization
  "An educational organization."
  {:db/ident        :schema/EducationalOrganization,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An educational organization.",
   :rdfs/label      "educational organization",
   :rdfs/subClassOf [:schema/Organization :schema/CivicStructure]})

(def ElementarySchool
  "An elementary school."
  {:db/ident        :schema/ElementarySchool,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An elementary school.",
   :rdfs/label      "elementary school",
   :rdfs/subClassOf :schema/EducationalOrganization})

(def Embassy
  "An embassy."
  {:db/ident        :schema/Embassy,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An embassy.",
   :rdfs/label      "embassy",
   :rdfs/subClassOf :schema/GovernmentBuilding})

(def EmergencyService
  "An emergency service, such as a fire station or ER."
  {:db/ident        :schema/EmergencyService,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An emergency service, such as a fire station or ER.",
   :rdfs/label      "emergency service",
   :rdfs/subClassOf :schema/LocalBusiness})

(def EmploymentAgency
  "An employment agency."
  {:db/ident        :schema/EmploymentAgency,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An employment agency.",
   :rdfs/label      "employment agency",
   :rdfs/subClassOf :schema/LocalBusiness})

(def EntertainmentBusiness
  "A business providing entertainment."
  {:db/ident        :schema/EntertainmentBusiness,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A business providing entertainment.",
   :rdfs/label      "entertainment business",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Episode
  "A media episode (e.g. TV, radio, video game) which can be part of a series or season."
  {:db/ident :schema/Episode,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A media episode (e.g. TV, radio, video game) which can be part of a series or season.",
   :rdfs/label "episode",
   :rdfs/subClassOf :schema/CreativeWork})

(def Event
  "An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class=\"localLink\" href=\"http://schema.org/offers\">offers</a> property. Repeated events may be structured as separate Event objects."
  {:db/ident :schema/Event,
   :owl/disjointWith
   [:schema/Place :schema/Organization :schema/CreativeWork :schema/Person],
   :rdf/type :owl/Class,
   :rdfs/comment
   "An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class=\"localLink\" href=\"http://schema.org/offers\">offers</a> property. Repeated events may be structured as separate Event objects.",
   :rdfs/label "event",
   :rdfs/subClassOf :schema/Thing})

(def EventSeries
  "A series of <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>s. Included events can relate with the series using the <a class=\"localLink\" href=\"http://schema.org/superEvent\">superEvent</a> property.<br/><br/> An EventSeries is a collection of events that share some unifying characteristic. For example, \"The Olympic Games\" is a series, which is repeated regularly. The \"2012 London Olympics\" can be presented both as an <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a> in the series \"Olympic Games\", and as an <a class=\"localLink\" href=\"http://schema.org/EventSeries\">EventSeries</a> that included a number of sporting competitions as Events.<br/><br/> The nature of the association between the events in an <a class=\"localLink\" href=\"http://schema.org/EventSeries\">EventSeries</a> can vary, but typical examples could include a thematic event series (e.g. topical meetups or classes), or a series of regular events that share a location, attendee group and/or organizers.<br/><br/> EventSeries has been defined as a kind of Event to make it easy for publishers to use it in an Event context without worrying about which kinds of series are really event-like enough to call an Event. In general an EventSeries may seem more Event-like when the period of time is compact and when aspects such as location are fixed, but it may also sometimes prove useful to describe a longer-term series as an Event."
  {:db/ident :schema/EventSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A series of <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>s. Included events can relate with the series using the <a class=\"localLink\" href=\"http://schema.org/superEvent\">superEvent</a> property.<br/><br/>\n\nAn EventSeries is a collection of events that share some unifying characteristic. For example, \"The Olympic Games\" is a series, which\nis repeated regularly. The \"2012 London Olympics\" can be presented both as an <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a> in the series \"Olympic Games\", and as an\n<a class=\"localLink\" href=\"http://schema.org/EventSeries\">EventSeries</a> that included a number of sporting competitions as Events.<br/><br/>\n\nThe nature of the association between the events in an <a class=\"localLink\" href=\"http://schema.org/EventSeries\">EventSeries</a> can vary, but typical examples could\ninclude a thematic event series (e.g. topical meetups or classes), or a series of regular events that share a location, attendee group and/or organizers.<br/><br/>\n\nEventSeries has been defined as a kind of Event to make it easy for publishers to use it in an Event context without\nworrying about which kinds of series are really event-like enough to call an Event. In general an EventSeries\nmay seem more Event-like when the period of time is compact and when aspects such as location are fixed, but\nit may also sometimes prove useful to describe a longer-term series as an Event.",
   :rdfs/label "event series",
   :rdfs/subClassOf :schema/Event})

(def EventVenue
  "An event venue."
  {:db/ident        :schema/EventVenue,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An event venue.",
   :rdfs/label      "event venue",
   :rdfs/subClassOf :schema/CivicStructure})

(def Festival
  "Event type: Festival."
  {:db/ident        :schema/Festival,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Event type: Festival.",
   :rdfs/label      "festival",
   :rdfs/subClassOf :schema/Event})

(def FinancialProduct
  "A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry."
  {:db/ident :schema/FinancialProduct,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.",
   :rdfs/label "financial product",
   :rdfs/subClassOf :schema/Service})

(def FinancialService
  "Financial services business."
  {:db/ident        :schema/FinancialService,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Financial services business.",
   :rdfs/label      "financial service",
   :rdfs/subClassOf :schema/LocalBusiness})

(def FireStation
  "A fire station. With firemen."
  {:db/ident        :schema/FireStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A fire station. With firemen.",
   :rdfs/label      "fire station",
   :rdfs/subClassOf [:schema/CivicStructure :schema/EmergencyService]})

(def FoodEstablishment
  "A food-related business."
  {:db/ident        :schema/FoodEstablishment,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A food-related business.",
   :rdfs/label      "food establishment",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Game
  "The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting."
  {:db/ident :schema/Game,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.",
   :rdfs/label "game",
   :rdfs/subClassOf :schema/CreativeWork})

(def GasStation
  "A gas station."
  {:db/ident        :schema/GasStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A gas station.",
   :rdfs/label      "gas station",
   :rdfs/subClassOf :schema/AutomotiveBusiness})

(def GeoCoordinates
  "The geographic coordinates of a place or event."
  {:db/ident     :schema/GeoCoordinates,
   :rdf/type     :owl/Class,
   :rdfs/comment "The geographic coordinates of a place or event.",
   :rdfs/label   "geo coordinates"})

(def GolfCourse
  "A golf course."
  {:db/ident        :schema/GolfCourse,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A golf course.",
   :rdfs/label      "golf course",
   :rdfs/subClassOf :schema/SportsActivityLocation})

(def GovernmentBuilding
  "A government building."
  {:db/ident        :schema/GovernmentBuilding,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A government building.",
   :rdfs/label      "government building",
   :rdfs/subClassOf :schema/CivicStructure})

(def GovernmentOffice
  "A government office&#x2014;for example, an IRS or DMV office."
  {:db/ident :schema/GovernmentOffice,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A government office&#x2014;for example, an IRS or DMV office.",
   :rdfs/label "government office",
   :rdfs/subClassOf :schema/LocalBusiness})

(def GovernmentOrganization
  "A governmental organization or agency."
  {:db/ident        :schema/GovernmentOrganization,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A governmental organization or agency.",
   :rdfs/label      "government organization",
   :rdfs/subClassOf :schema/Organization})

(def GroceryStore
  "A grocery store."
  {:db/ident        :schema/GroceryStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A grocery store.",
   :rdfs/label      "grocery store",
   :rdfs/subClassOf :schema/Store})

(def HealthAndBeautyBusiness
  "Health and beauty."
  {:db/ident        :schema/HealthAndBeautyBusiness,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Health and beauty.",
   :rdfs/label      "health and beauty business",
   :rdfs/subClassOf :schema/LocalBusiness})

(def HealthClub
  "A health club."
  {:db/ident        :schema/HealthClub,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A health club.",
   :rdfs/label      "health club",
   :rdfs/subClassOf [:schema/HealthAndBeautyBusiness
                     :schema/SportsActivityLocation]})

(def HinduTemple
  "A Hindu temple."
  {:db/ident        :schema/HinduTemple,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Hindu temple.",
   :rdfs/label      "hindu temple",
   :rdfs/subClassOf :schema/PlaceOfWorship})

(def Hospital
  "A hospital."
  {:db/ident        :schema/Hospital,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A hospital.",
   :rdfs/label      "hospital",
   :rdfs/subClassOf [:schema/CivicStructure
                     :schema/MedicalOrganization
                     :schema/EmergencyService]})

(def Hostel
  "A hostel - cheap accommodation, often in shared dormitories. <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Hostel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A hostel - cheap accommodation, often in shared dormitories.\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "hostel",
   :rdfs/subClassOf :schema/LodgingBusiness})

(def Hotel
  "A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel). <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Hotel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A hotel is an establishment that provides lodging paid on a short-term basis (Source: Wikipedia, the free encyclopedia, see http://en.wikipedia.org/wiki/Hotel).\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "hotel",
   :rdfs/subClassOf :schema/LodgingBusiness})

(def House
  "A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/House\">http://en.wikipedia.org/wiki/House</a>)."
  {:db/ident :schema/House,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/House\">http://en.wikipedia.org/wiki/House</a>).",
   :rdfs/label "house",
   :rdfs/subClassOf :schema/Accommodation})

(def IceCreamShop
  "An ice cream shop."
  {:db/ident        :schema/IceCreamShop,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An ice cream shop.",
   :rdfs/label      "ice cream shop",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def ImageObject
  "An image file."
  {:db/ident        :schema/ImageObject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An image file.",
   :rdfs/label      "image object",
   :rdfs/subClassOf :schema/MediaObject})

(def InfectiousDisease
  "An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease."
  {:db/ident :schema/InfectiousDisease,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An infectious disease is a clinically evident human disease resulting from the presence of pathogenic microbial agents, like pathogenic viruses, pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To be considered an infectious disease, such pathogens are known to be able to cause this disease.",
   :rdfs/label "infectious disease",
   :rdfs/subClassOf :schema/MedicalCondition})

(def Joint
  "The anatomical location at which two or more bones make contact."
  {:db/ident :schema/Joint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The anatomical location at which two or more bones make contact.",
   :rdfs/label "joint",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def LakeBodyOfWater
  "A lake (for example, Lake Pontrachain)."
  {:db/ident        :schema/LakeBodyOfWater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A lake (for example, Lake Pontrachain).",
   :rdfs/label      "lake body of water",
   :rdfs/subClassOf :schema/BodyOfWater})

(def Landform
  "A landform or physical feature. Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins."
  {:db/ident :schema/Landform,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.",
   :rdfs/label "landform",
   :rdfs/subClassOf :schema/Place})

(def LandmarksOrHistoricalBuildings
  "An historical landmark or building."
  {:db/ident        :schema/LandmarksOrHistoricalBuildings,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An historical landmark or building.",
   :rdfs/label      "landmarks or historical buildings",
   :rdfs/subClassOf :schema/Place})

(def Language
  "Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in <a href=\"https://en.wikipedia.org/wiki/IETF_language_tag\">BCP 47</a> can be used via the <a class=\"localLink\" href=\"http://schema.org/alternateName\">alternateName</a> property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using <a class=\"localLink\" href=\"http://schema.org/ComputerLanguage\">ComputerLanguage</a>."
  {:db/ident :schema/Language,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in <a href=\"https://en.wikipedia.org/wiki/IETF_language_tag\">BCP 47</a> can be used via the <a class=\"localLink\" href=\"http://schema.org/alternateName\">alternateName</a> property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using <a class=\"localLink\" href=\"http://schema.org/ComputerLanguage\">ComputerLanguage</a>.",
   :rdfs/label "language",
   :rdfs/subClassOf :schema/Thing})

(def Legislation
  "A legal document such as an act, decree, bill, etc. (enforceable or not) or a component of a legal act (like an article)."
  {:db/ident :schema/Legislation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A legal document such as an act, decree, bill, etc. (enforceable or not) or a component of a legal act (like an article).",
   :rdfs/label "legislation",
   :rdfs/subClassOf :schema/CreativeWork})

(def Library
  "A library."
  {:db/ident        :schema/Library,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A library.",
   :rdfs/label      "library",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Ligament
  "A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints."
  {:db/ident :schema/Ligament,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.",
   :rdfs/label "ligament",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def LiquorStore
  "A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits."
  {:db/ident :schema/LiquorStore,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.",
   :rdfs/label "liquor store",
   :rdfs/subClassOf :schema/Store})

(def LocalBusiness
  "A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc."
  {:db/ident :schema/LocalBusiness,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.",
   :rdfs/label "local business",
   :rdfs/subClassOf [:schema/Organization :schema/Place]})

(def LodgingBusiness
  "A lodging business, such as a motel, hotel, or inn."
  {:db/ident        :schema/LodgingBusiness,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A lodging business, such as a motel, hotel, or inn.",
   :rdfs/label      "lodging business",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Manuscript
  "A book, document, or piece of music written by hand rather than typed or printed."
  {:db/ident :schema/Manuscript,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A book, document, or piece of music written by hand rather than typed or printed.",
   :rdfs/label "manuscript",
   :rdfs/subClassOf :schema/CreativeWork})

(def Map
  "A map."
  {:db/ident        :schema/Map,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A map.",
   :rdfs/label      "map",
   :rdfs/subClassOf :schema/CreativeWork})

(def MediaObject
  "A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's)."
  {:db/ident :schema/MediaObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).",
   :rdfs/label "media object",
   :rdfs/subClassOf :schema/CreativeWork})

(def MedicalBusiness
  "A particular physical or virtual business of an organization for medical purposes. Examples of MedicalBusiness include differents business run by health professionals."
  {:db/ident :schema/MedicalBusiness,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A particular physical or virtual business of an organization for medical purposes. Examples of MedicalBusiness include differents business run by health professionals.",
   :rdfs/label "medical business",
   :rdfs/subClassOf :schema/LocalBusiness})

(def MedicalClinic
  "A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well."
  {:db/ident :schema/MedicalClinic,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well.",
   :rdfs/label "medical clinic",
   :rdfs/subClassOf [:schema/MedicalOrganization :schema/MedicalBusiness]})

(def MedicalCondition
  "Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc."
  {:db/ident :schema/MedicalCondition,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any condition of the human body that affects the normal functioning of a person, whether physically or mentally. Includes diseases, injuries, disabilities, disorders, syndromes, etc.",
   :rdfs/label "medical condition",
   :rdfs/subClassOf :schema/MedicalEntity})

(def MedicalDevice
  "Any object used in a medical capacity, such as to diagnose or treat a patient."
  {:db/ident :schema/MedicalDevice,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any object used in a medical capacity, such as to diagnose or treat a patient.",
   :rdfs/label "medical device",
   :rdfs/subClassOf :schema/MedicalEntity})

(def MedicalEntity
  "The most generic type of entity related to health and the practice of medicine."
  {:db/ident :schema/MedicalEntity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The most generic type of entity related to health and the practice of medicine.",
   :rdfs/label "medical entity",
   :rdfs/subClassOf :schema/Thing})

(def MedicalGuideline
  "Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity."
  {:db/ident :schema/MedicalGuideline,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.",
   :rdfs/label "medical guideline",
   :rdfs/subClassOf :schema/MedicalEntity})

(def MedicalOrganization
  "A medical organization (physical or not), such as hospital, institution or clinic."
  {:db/ident :schema/MedicalOrganization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A medical organization (physical or not), such as hospital, institution or clinic.",
   :rdfs/label "medical organization",
   :rdfs/subClassOf :schema/Organization})

(def MedicalProcedure
  "A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques."
  {:db/ident :schema/MedicalProcedure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.",
   :rdfs/label "medical procedure",
   :rdfs/subClassOf :schema/MedicalEntity})

(def MedicalSign
  "Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination."
  {:db/ident :schema/MedicalSign,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.",
   :rdfs/label "medical sign",
   :rdfs/subClassOf :schema/MedicalSignOrSymptom})

(def MedicalSignOrSymptom
  "Any feature associated or not with a medical condition. In medicine a symptom is generally subjective while a sign is objective."
  {:db/ident :schema/MedicalSignOrSymptom,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any feature associated or not with a medical condition. In medicine a symptom is generally subjective while a sign is objective.",
   :rdfs/label "medical sign or symptom",
   :rdfs/subClassOf :schema/MedicalCondition})

(def MedicalSpecialty
  "Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type."
  {:db/ident :schema/MedicalSpecialty,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any specific branch of medical science or practice. Medical specialities include clinical specialties that pertain to particular organ systems and their respective disease states, as well as allied health specialties. Enumerated type.",
   :rdfs/label "medical specialty",
   :rdfs/subClassOf [:schema/MedicalEntity :schema/Specialty]})

(def MedicalSymptom
  "Any complaint sensed and expressed by the patient (therefore defined as subjective) like stomachache, lower-back pain, or fatigue."
  {:db/ident :schema/MedicalSymptom,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any complaint sensed and expressed by the patient (therefore defined as subjective)  like stomachache, lower-back pain, or fatigue.",
   :rdfs/label "medical symptom",
   :rdfs/subClassOf :schema/MedicalSignOrSymptom})

(def MedicalTest
  "Any medical test, typically performed for diagnostic purposes."
  {:db/ident :schema/MedicalTest,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any medical test, typically performed for diagnostic purposes.",
   :rdfs/label "medical test",
   :rdfs/subClassOf :schema/MedicalEntity})

(def MedicalTherapy
  "Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition."
  {:db/ident :schema/MedicalTherapy,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any medical intervention designed to prevent, treat, and cure human diseases and medical conditions, including both curative and palliative therapies. Medical therapies are typically processes of care relying upon pharmacotherapy, behavioral therapy, supportive therapy (with fluid or nutrition for example), or detoxification (e.g. hemodialysis) aimed at improving or preventing a health condition.",
   :rdfs/label "medical therapy",
   :rdfs/subClassOf :schema/TherapeuticProcedure})

(def MiddleSchool
  "A middle school (typically for children aged around 11-14, although this varies somewhat)."
  {:db/ident :schema/MiddleSchool,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A middle school (typically for children aged around 11-14, although this varies somewhat).",
   :rdfs/label "middle school",
   :rdfs/subClassOf :schema/EducationalOrganization})

(def MobileApplication
  "A software application designed specifically to work well on a mobile device such as a telephone."
  {:db/ident :schema/MobileApplication,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A software application designed specifically to work well on a mobile device such as a telephone.",
   :rdfs/label "mobile application",
   :rdfs/subClassOf :schema/SoftwareApplication})

(def Mosque
  "A mosque."
  {:db/ident        :schema/Mosque,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A mosque.",
   :rdfs/label      "mosque",
   :rdfs/subClassOf :schema/PlaceOfWorship})

(def Motel
  "A motel. <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Motel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A motel.\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "motel",
   :rdfs/subClassOf :schema/LodgingBusiness})

(def Motorcycle
  "A motorcycle or motorbike is a single-track, two-wheeled motor vehicle."
  {:db/ident :schema/Motorcycle,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.",
   :rdfs/label "motorcycle",
   :rdfs/subClassOf :schema/Vehicle})

(def Mountain
  "A mountain, like Mount Whitney or Mount Everest."
  {:db/ident        :schema/Mountain,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A mountain, like Mount Whitney or Mount Everest.",
   :rdfs/label      "mountain",
   :rdfs/subClassOf :schema/Landform})

(def Movie
  "A movie."
  {:db/ident        :schema/Movie,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A movie.",
   :rdfs/label      "movie",
   :rdfs/subClassOf :schema/CreativeWork})

(def MovieSeries
  "A series of movies. Included movies can be indicated with the hasPart property."
  {:db/ident :schema/MovieSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A series of movies. Included movies can be indicated with the hasPart property.",
   :rdfs/label "movie series",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def MovieTheater
  "A movie theater."
  {:db/ident        :schema/MovieTheater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A movie theater.",
   :rdfs/label      "movie theater",
   :rdfs/subClassOf [:schema/EntertainmentBusiness :schema/CivicStructure]})

(def Muscle
  "A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement."
  {:db/ident :schema/Muscle,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.",
   :rdfs/label "muscle",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def Museum
  "A museum."
  {:db/ident        :schema/Museum,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A museum.",
   :rdfs/label      "museum",
   :rdfs/subClassOf :schema/CivicStructure})

(def MusicAlbum
  "A collection of music tracks."
  {:db/ident        :schema/MusicAlbum,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A collection of music tracks.",
   :rdfs/label      "music album",
   :rdfs/subClassOf :schema/MusicPlaylist})

(def MusicComposition
  "A musical composition."
  {:db/ident        :schema/MusicComposition,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A musical composition.",
   :rdfs/label      "music composition",
   :rdfs/subClassOf :schema/CreativeWork})

(def MusicGroup
  "A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician."
  {:db/ident :schema/MusicGroup,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.",
   :rdfs/label "music group",
   :rdfs/subClassOf :schema/PerformingGroup})

(def MusicPlaylist
  "A collection of music tracks in playlist form."
  {:db/ident        :schema/MusicPlaylist,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A collection of music tracks in playlist form.",
   :rdfs/label      "music playlist",
   :rdfs/subClassOf :schema/CreativeWork})

(def MusicRelease
  "A MusicRelease is a specific release of a music album."
  {:db/ident        :schema/MusicRelease,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A MusicRelease is a specific release of a music album.",
   :rdfs/label      "music release",
   :rdfs/subClassOf :schema/MusicPlaylist})

(def MusicVenue
  "A music venue."
  {:db/ident        :schema/MusicVenue,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A music venue.",
   :rdfs/label      "music venue",
   :rdfs/subClassOf :schema/CivicStructure})

(def NGO
  "Organization: Non-governmental Organization."
  {:db/ident        :schema/NGO,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Organization: Non-governmental Organization.",
   :rdfs/label      "n g o",
   :rdfs/subClassOf :schema/Organization})

(def NailSalon
  "A nail salon."
  {:db/ident        :schema/NailSalon,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A nail salon.",
   :rdfs/label      "nail salon",
   :rdfs/subClassOf :schema/HealthAndBeautyBusiness})

(def Nerve
  "A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons."
  {:db/ident :schema/Nerve,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.",
   :rdfs/label "nerve",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def NewsArticle
  "A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.<br/><br/> A more detailed overview of <a href=\"/docs/news.html\">schema.org News markup</a> is also available."
  {:db/ident :schema/NewsArticle,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.<br/><br/>\n\nA more detailed overview of <a href=\"/docs/news.html\">schema.org News markup</a> is also available.",
   :rdfs/label "news article",
   :rdfs/subClassOf :schema/Article})

(def Newspaper
  "A publication containing information about varied topics that are pertinent to general information, a geographic area, or a specific subject matter (i.e. business, culture, education). Often published daily."
  {:db/ident :schema/Newspaper,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A publication containing information about varied topics that are pertinent to general information, a geographic area, or a specific subject matter (i.e. business, culture, education). Often published daily.",
   :rdfs/label "newspaper",
   :rdfs/subClassOf :schema/Periodical})

(def NightClub
  "A nightclub or discotheque."
  {:db/ident        :schema/NightClub,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A nightclub or discotheque.",
   :rdfs/label      "night club",
   :rdfs/subClassOf :schema/EntertainmentBusiness})

(def Occupation
  "A profession, may involve prolonged training and/or a formal qualification."
  {:db/ident :schema/Occupation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A profession, may involve prolonged training and/or a formal qualification.",
   :rdfs/label "occupation",
   :rdfs/subClassOf :schema/Thing})

(def OceanBodyOfWater
  "An ocean (for example, the Pacific)."
  {:db/ident        :schema/OceanBodyOfWater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An ocean (for example, the Pacific).",
   :rdfs/label      "ocean body of water",
   :rdfs/subClassOf :schema/BodyOfWater})

(def Optician
  "A store that sells reading glasses and similar devices for improving vision."
  {:db/ident :schema/Optician,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A store that sells reading glasses and similar devices for improving vision.",
   :rdfs/label "optician",
   :rdfs/subClassOf :schema/MedicalBusiness})

(def Organization
  "An organization such as a school, NGO, corporation, club, etc."
  {:db/ident :schema/Organization,
   :owl/disjointWith [:schema/Event :schema/CreativeWork :schema/Person],
   :rdf/type :owl/Class,
   :rdfs/comment
   "An organization such as a school, NGO, corporation, club, etc.",
   :rdfs/label "organization",
   :rdfs/subClassOf :schema/Thing})

(def OutletStore
  "An outlet store."
  {:db/ident        :schema/OutletStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An outlet store.",
   :rdfs/label      "outlet store",
   :rdfs/subClassOf :schema/Store})

(def Painting
  "A painting."
  {:db/ident        :schema/Painting,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A painting.",
   :rdfs/label      "painting",
   :rdfs/subClassOf :schema/CreativeWork})

(def Park
  "A park."
  {:db/ident        :schema/Park,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A park.",
   :rdfs/label      "park",
   :rdfs/subClassOf :schema/CivicStructure})

(def ParkingFacility
  "A parking lot or other parking facility."
  {:db/ident        :schema/ParkingFacility,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A parking lot or other parking facility.",
   :rdfs/label      "parking facility",
   :rdfs/subClassOf :schema/CivicStructure})

(def PawnShop
  "A shop that will buy, or lend money against the security of, personal possessions."
  {:db/ident :schema/PawnShop,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A shop that will buy, or lend money against the security of, personal possessions.",
   :rdfs/label "pawn shop",
   :rdfs/subClassOf :schema/Store})

(def PerformingArtsTheater
  "A theater or other performing art center."
  {:db/ident        :schema/PerformingArtsTheater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A theater or other performing art center.",
   :rdfs/label      "performing arts theater",
   :rdfs/subClassOf :schema/CivicStructure})

(def PerformingGroup
  "A performance group, such as a band, an orchestra, or a circus."
  {:db/ident :schema/PerformingGroup,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A performance group, such as a band, an orchestra, or a circus.",
   :rdfs/label "performing group",
   :rdfs/subClassOf :schema/Organization})

(def Periodical
  "A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.<br/><br/> See also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>."
  {:db/ident :schema/Periodical,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A publication in any medium issued in successive parts bearing numerical or chronological designations and intended, such as a magazine, scholarly journal, or newspaper to continue indefinitely.<br/><br/>\n\nSee also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>.",
   :rdfs/label "periodical",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def Person
  "A person (alive, dead, undead, or fictional)."
  {:db/ident         :schema/Person,
   :owl/disjointWith [:schema/CreativeWork
                      :schema/Organization
                      :schema/Place
                      :schema/Event],
   :rdf/type         :owl/Class,
   :rdfs/comment     "A person (alive, dead, undead, or fictional).",
   :rdfs/label       "person",
   :rdfs/subClassOf  :schema/Thing})

(def PetStore
  "A pet store."
  {:db/ident        :schema/PetStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A pet store.",
   :rdfs/label      "pet store",
   :rdfs/subClassOf :schema/Store})

(def Pharmacy
  "A pharmacy or drugstore."
  {:db/ident        :schema/Pharmacy,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A pharmacy or drugstore.",
   :rdfs/label      "pharmacy",
   :rdfs/subClassOf [:schema/MedicalOrganization :schema/MedicalBusiness]})

(def Photograph
  "A photograph."
  {:db/ident        :schema/Photograph,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A photograph.",
   :rdfs/label      "photograph",
   :rdfs/subClassOf :schema/CreativeWork})

(def PhysicalExam
  "A type of physical examination of a patient performed by a physician."
  {:db/ident :schema/PhysicalExam,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A type of physical examination of a patient performed by a physician.",
   :rdfs/label "physical exam",
   :rdfs/subClassOf [:schema/MedicalEntity :schema/MedicalProcedure]})

(def Place
  "Entities that have a somewhat fixed, physical extension."
  {:db/ident         :schema/Place,
   :owl/disjointWith [:schema/Person :schema/CreativeWork :schema/Event],
   :rdf/type         :owl/Class,
   :rdfs/comment     "Entities that have a somewhat fixed, physical extension.",
   :rdfs/label       "place",
   :rdfs/subClassOf  :schema/Thing})

(def PlaceOfWorship
  "Place of worship, such as a church, synagogue, or mosque."
  {:db/ident        :schema/PlaceOfWorship,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Place of worship, such as a church, synagogue, or mosque.",
   :rdfs/label      "place of worship",
   :rdfs/subClassOf :schema/CivicStructure})

(def Play
  "A play is a form of literature, usually consisting of dialogue between characters, intended for theatrical performance rather than just reading. Note the peformance of a Play would be a <a class=\"localLink\" href=\"http://schema.org/TheaterEvent\">TheaterEvent</a> - the <em>Play</em> being the <a class=\"localLink\" href=\"http://schema.org/workPerformed\">workPerformed</a>."
  {:db/ident :schema/Play,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A play is a form of literature, usually consisting of dialogue between characters, intended for theatrical performance rather than just reading. Note the peformance of a Play would be a <a class=\"localLink\" href=\"http://schema.org/TheaterEvent\">TheaterEvent</a> - the <em>Play</em> being the <a class=\"localLink\" href=\"http://schema.org/workPerformed\">workPerformed</a>.",
   :rdfs/label "play",
   :rdfs/subClassOf :schema/CreativeWork})

(def Playground
  "A playground."
  {:db/ident        :schema/Playground,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A playground.",
   :rdfs/label      "playground",
   :rdfs/subClassOf :schema/CivicStructure})

(def PodcastSeries
  "A podcast is an episodic series of digital audio or video files which a user can download and listen to."
  {:db/ident :schema/PodcastSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A podcast is an episodic series of digital audio or video files which a user can download and listen to.",
   :rdfs/label "podcast series",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def PoliceStation
  "A police station."
  {:db/ident        :schema/PoliceStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A police station.",
   :rdfs/label      "police station",
   :rdfs/subClassOf [:schema/CivicStructure :schema/EmergencyService]})

(def Pond
  "A pond."
  {:db/ident        :schema/Pond,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A pond.",
   :rdfs/label      "pond",
   :rdfs/subClassOf :schema/BodyOfWater})

(def PostOffice
  "A post office."
  {:db/ident        :schema/PostOffice,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A post office.",
   :rdfs/label      "post office",
   :rdfs/subClassOf :schema/GovernmentOffice})

(def Poster
  "A large, usually printed placard, bill, or announcement, often illustrated, that is posted to advertise or publicize something."
  {:db/ident :schema/Poster,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A large, usually printed placard, bill, or announcement, often illustrated, that is posted to advertise or publicize something.",
   :rdfs/label "poster",
   :rdfs/subClassOf :schema/CreativeWork})

(def Preschool
  "A preschool."
  {:db/ident        :schema/Preschool,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A preschool.",
   :rdfs/label      "preschool",
   :rdfs/subClassOf :schema/EducationalOrganization})

(def Product
  "Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online."
  {:db/ident :schema/Product,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.",
   :rdfs/label "product",
   :rdfs/subClassOf :schema/Thing})

(def ProductModel
  "A datasheet or vendor specification of a product (in the sense of a prototypical description)."
  {:db/ident :schema/ProductModel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A datasheet or vendor specification of a product (in the sense of a prototypical description).",
   :rdfs/label "product model",
   :rdfs/subClassOf :schema/Product})

(def PublicSwimmingPool
  "A public swimming pool."
  {:db/ident        :schema/PublicSwimmingPool,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A public swimming pool.",
   :rdfs/label      "public swimming pool",
   :rdfs/subClassOf :schema/SportsActivityLocation})

(def PublicToilet
  "A public toilet is a room or small building containing one or more toilets (and possibly also urinals) which is available for use by the general public, or by customers or employees of certain businesses."
  {:db/ident :schema/PublicToilet,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A public toilet is a room or small building containing one or more toilets (and possibly also urinals) which is available for use by the general public, or by customers or employees of certain businesses.",
   :rdfs/label "public toilet",
   :rdfs/subClassOf :schema/CivicStructure})

(def PublicationIssue
  "A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.<br/><br/> See also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>."
  {:db/ident :schema/PublicationIssue,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.<br/><br/>\n\nSee also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>.",
   :rdfs/label "publication issue",
   :rdfs/subClassOf :schema/CreativeWork})

(def PublicationVolume
  "A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.<br/><br/> See also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>."
  {:db/ident :schema/PublicationVolume,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.<br/><br/>\n\nSee also <a href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog post</a>.",
   :rdfs/label "publication volume",
   :rdfs/subClassOf :schema/CreativeWork})

(def QuantitativeValue
  "A point value or interval for product characteristics and other purposes."
  {:db/ident :schema/QuantitativeValue,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A point value or interval for product characteristics and other purposes.",
   :rdfs/label "quantitative value"})

(def RadiationTherapy
  "A process of care using radiation aimed at improving a health condition."
  {:db/ident :schema/RadiationTherapy,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A process of care using radiation aimed at improving a health condition.",
   :rdfs/label "radiation therapy",
   :rdfs/subClassOf :schema/MedicalTherapy})

(def RadioChannel
  "A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup."
  {:db/ident :schema/RadioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.",
   :rdfs/label "radio channel",
   :rdfs/subClassOf :schema/BroadcastChannel})

(def RadioSeries
  "CreativeWorkSeries dedicated to radio broadcast and associated online delivery."
  {:db/ident :schema/RadioSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "CreativeWorkSeries dedicated to radio broadcast and associated online delivery.",
   :rdfs/label "radio series",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def RadioStation
  "A radio station."
  {:db/ident        :schema/RadioStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A radio station.",
   :rdfs/label      "radio station",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Rating
  "A rating is an evaluation on a numeric scale, such as 1 to 5 stars."
  {:db/ident :schema/Rating,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A rating is an evaluation on a numeric scale, such as 1 to 5 stars.",
   :rdfs/label "rating",
   :rdfs/subClassOf :schema/Thing})

(def RecyclingCenter
  "A recycling center."
  {:db/ident        :schema/RecyclingCenter,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A recycling center.",
   :rdfs/label      "recycling center",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Report
  "A Report generated by governmental or non-governmental organization."
  {:db/ident :schema/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Report generated by governmental or non-governmental organization.",
   :rdfs/label "report",
   :rdfs/subClassOf :schema/Article})

(def Reservoir
  "A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir."
  {:db/ident :schema/Reservoir,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir.",
   :rdfs/label "reservoir",
   :rdfs/subClassOf :schema/BodyOfWater})

(def Resort
  "A resort is a place used for relaxation or recreation, attracting visitors for holidays or vacations. Resorts are places, towns or sometimes commercial establishment operated by a single company (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/Resort\">http://en.wikipedia.org/wiki/Resort</a>). <br /><br /> See also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>."
  {:db/ident :schema/Resort,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A resort is a place used for relaxation or recreation, attracting visitors for holidays or vacations. Resorts are places, towns or sometimes commercial establishment operated by a single company (Source: Wikipedia, the free encyclopedia, see <a href=\"http://en.wikipedia.org/wiki/Resort\">http://en.wikipedia.org/wiki/Resort</a>).\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.",
   :rdfs/label "resort",
   :rdfs/subClassOf :schema/LodgingBusiness})

(def Restaurant
  "A restaurant."
  {:db/ident        :schema/Restaurant,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A restaurant.",
   :rdfs/label      "restaurant",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def RiverBodyOfWater
  "A river (for example, the broad majestic Shannon)."
  {:db/ident        :schema/RiverBodyOfWater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A river (for example, the broad majestic Shannon).",
   :rdfs/label      "river body of water",
   :rdfs/subClassOf :schema/BodyOfWater})

(def ScholarlyArticle
  "A scholarly article."
  {:db/ident        :schema/ScholarlyArticle,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A scholarly article.",
   :rdfs/label      "scholarly article",
   :rdfs/subClassOf :schema/Article})

(def School
  "A school."
  {:db/ident        :schema/School,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A school.",
   :rdfs/label      "school",
   :rdfs/subClassOf :schema/EducationalOrganization})

(def Sculpture
  "A piece of sculpture."
  {:db/ident        :schema/Sculpture,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A piece of sculpture.",
   :rdfs/label      "sculpture",
   :rdfs/subClassOf :schema/CreativeWork})

(def SeaBodyOfWater
  "A sea (for example, the Caspian sea)."
  {:db/ident        :schema/SeaBodyOfWater,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sea (for example, the Caspian sea).",
   :rdfs/label      "sea body of water",
   :rdfs/subClassOf :schema/BodyOfWater})

(def SelfStorage
  "A self-storage facility."
  {:db/ident        :schema/SelfStorage,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A self-storage facility.",
   :rdfs/label      "self storage",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Service
  "A service provided by an organization, e.g. delivery service, print services, etc."
  {:db/ident :schema/Service,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A service provided by an organization, e.g. delivery service, print services, etc.",
   :rdfs/label "service",
   :rdfs/subClassOf :schema/Thing})

(def SheetMusic
  "Printed music, as opposed to performed or recorded music."
  {:db/ident        :schema/SheetMusic,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Printed music, as opposed to performed or recorded music.",
   :rdfs/label      "sheet music",
   :rdfs/subClassOf :schema/CreativeWork})

(def ShoeStore
  "A shoe store."
  {:db/ident        :schema/ShoeStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A shoe store.",
   :rdfs/label      "shoe store",
   :rdfs/subClassOf :schema/Store})

(def ShoppingCenter
  "A shopping center or mall."
  {:db/ident        :schema/ShoppingCenter,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A shopping center or mall.",
   :rdfs/label      "shopping center",
   :rdfs/subClassOf :schema/LocalBusiness})

(def SkiResort
  "A ski resort."
  {:db/ident        :schema/SkiResort,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A ski resort.",
   :rdfs/label      "ski resort",
   :rdfs/subClassOf :schema/SportsActivityLocation})

(def SocialMediaPosting
  "A post to a social media platform, including blog posts, tweets, Facebook posts, etc."
  {:db/ident :schema/SocialMediaPosting,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A post to a social media platform, including blog posts, tweets, Facebook posts, etc.",
   :rdfs/label "social media posting",
   :rdfs/subClassOf :schema/Article})

(def SoftwareApplication
  "A software application."
  {:db/ident        :schema/SoftwareApplication,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A software application.",
   :rdfs/label      "software application",
   :rdfs/subClassOf :schema/CreativeWork})

(def Specialty
  "Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort."
  {:db/ident :schema/Specialty,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any branch of a field in which people typically develop specific expertise, usually after significant study, time, and effort.",
   :rdfs/label "specialty",
   :rdfs/subClassOf :schema/Thing})

(def SportsActivityLocation
  "A sports location, such as a playing field."
  {:db/ident        :schema/SportsActivityLocation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sports location, such as a playing field.",
   :rdfs/label      "sports activity location",
   :rdfs/subClassOf :schema/LocalBusiness})

(def SportsEvent
  "Event type: Sports event."
  {:db/ident        :schema/SportsEvent,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Event type: Sports event.",
   :rdfs/label      "sports event",
   :rdfs/subClassOf :schema/Event})

(def SportsOrganization
  "Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations."
  {:db/ident :schema/SportsOrganization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations.",
   :rdfs/label "sports organization",
   :rdfs/subClassOf :schema/Organization})

(def SportsTeam
  "Organization: Sports team."
  {:db/ident        :schema/SportsTeam,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Organization: Sports team.",
   :rdfs/label      "sports team",
   :rdfs/subClassOf :schema/SportsOrganization})

(def StadiumOrArena
  "A stadium."
  {:db/ident        :schema/StadiumOrArena,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A stadium.",
   :rdfs/label      "stadium or arena",
   :rdfs/subClassOf [:schema/SportsActivityLocation :schema/CivicStructure]})

(def State
  "A state or province of a country."
  {:db/ident        :schema/State,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A state or province of a country.",
   :rdfs/label      "state",
   :rdfs/subClassOf :schema/AdministrativeArea})

(def Store
  "A retail good store."
  {:db/ident        :schema/Store,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A retail good store.",
   :rdfs/label      "store",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Substance
  "Any matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical."
  {:db/ident :schema/Substance,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical.",
   :rdfs/label "substance",
   :rdfs/subClassOf :schema/MedicalEntity})

(def SubwayStation
  "A subway station."
  {:db/ident        :schema/SubwayStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A subway station.",
   :rdfs/label      "subway station",
   :rdfs/subClassOf :schema/CivicStructure})

(def SurgicalProcedure
  "A medical procedure involving an incision with instruments; performed for diagnose, or therapeutic purposes."
  {:db/ident :schema/SurgicalProcedure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A medical procedure involving an incision with instruments; performed for diagnose, or therapeutic purposes.",
   :rdfs/label "surgical procedure",
   :rdfs/subClassOf :schema/MedicalProcedure})

(def Synagogue
  "A synagogue."
  {:db/ident        :schema/Synagogue,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A synagogue.",
   :rdfs/label      "synagogue",
   :rdfs/subClassOf :schema/PlaceOfWorship})

(def TVEpisode
  "A TV episode which can be part of a series or season."
  {:db/ident        :schema/TVEpisode,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A TV episode which can be part of a series or season.",
   :rdfs/label      "t v episode",
   :rdfs/subClassOf :schema/Episode})

(def TVSeason
  "Season dedicated to TV broadcast and associated online delivery."
  {:db/ident :schema/TVSeason,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Season dedicated to TV broadcast and associated online delivery.",
   :rdfs/label "t v season",
   :rdfs/subClassOf [:schema/CreativeWork :schema/CreativeWorkSeason]})

(def TVSeries
  "CreativeWorkSeries dedicated to TV broadcast and associated online delivery."
  {:db/ident :schema/TVSeries,
   :rdf/type :owl/Class,
   :rdfs/comment
   "CreativeWorkSeries dedicated to TV broadcast and associated online delivery.",
   :rdfs/label "t v series",
   :rdfs/subClassOf [:schema/CreativeWorkSeries :schema/CreativeWork]})

(def TattooParlor
  "A tattoo parlor."
  {:db/ident        :schema/TattooParlor,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tattoo parlor.",
   :rdfs/label      "tattoo parlor",
   :rdfs/subClassOf :schema/HealthAndBeautyBusiness})

(def TelevisionChannel
  "A unique instance of a television BroadcastService on a CableOrSatelliteService lineup."
  {:db/ident :schema/TelevisionChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A unique instance of a television BroadcastService on a CableOrSatelliteService lineup.",
   :rdfs/label "television channel",
   :rdfs/subClassOf :schema/BroadcastChannel})

(def TelevisionStation
  "A television station."
  {:db/ident        :schema/TelevisionStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A television station.",
   :rdfs/label      "television station",
   :rdfs/subClassOf :schema/LocalBusiness})

(def TennisComplex
  "A tennis complex."
  {:db/ident        :schema/TennisComplex,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tennis complex.",
   :rdfs/label      "tennis complex",
   :rdfs/subClassOf :schema/SportsActivityLocation})

(def TheaterGroup
  "A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre."
  {:db/ident :schema/TheaterGroup,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre.",
   :rdfs/label "theater group",
   :rdfs/subClassOf :schema/PerformingGroup})

(def TherapeuticProcedure
  "A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition."
  {:db/ident :schema/TherapeuticProcedure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A medical procedure intended primarily for therapeutic purposes, aimed at improving a health condition.",
   :rdfs/label "therapeutic procedure",
   :rdfs/subClassOf :schema/MedicalProcedure})

(def Thesis
  "A thesis or dissertation document submitted in support of candidature for an academic degree or professional qualification."
  {:db/ident :schema/Thesis,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A thesis or dissertation document submitted in support of candidature for an academic degree or professional qualification.",
   :rdfs/label "thesis",
   :rdfs/subClassOf :schema/CreativeWork})

(def Thing
  "The most generic type of item."
  {:db/ident     :schema/Thing,
   :rdf/type     :owl/Class,
   :rdfs/comment "The most generic type of item.",
   :rdfs/label   "thing"})

(def TouristAttraction
  "A tourist attraction. In principle any Thing can be a <a class=\"localLink\" href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, from a <a class=\"localLink\" href=\"http://schema.org/Mountain\">Mountain</a> and <a class=\"localLink\" href=\"http://schema.org/LandmarksOrHistoricalBuildings\">LandmarksOrHistoricalBuildings</a> to a <a class=\"localLink\" href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>. This Type can be used on its own to describe a general <a class=\"localLink\" href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, or be used as an <a class=\"localLink\" href=\"http://schema.org/additionalType\">additionalType</a> to add tourist attraction properties to any other type. (See examples below)"
  {:db/ident :schema/TouristAttraction,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tourist attraction.  In principle any Thing can be a <a class=\"localLink\" href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, from a <a class=\"localLink\" href=\"http://schema.org/Mountain\">Mountain</a> and <a class=\"localLink\" href=\"http://schema.org/LandmarksOrHistoricalBuildings\">LandmarksOrHistoricalBuildings</a> to a <a class=\"localLink\" href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>.  This Type can be used on its own to describe a general <a class=\"localLink\" href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, or be used as an <a class=\"localLink\" href=\"http://schema.org/additionalType\">additionalType</a> to add tourist attraction properties to any other type.  (See examples below)",
   :rdfs/label "tourist attraction",
   :rdfs/subClassOf :schema/Place})

(def TouristInformationCenter
  "A tourist information center."
  {:db/ident        :schema/TouristInformationCenter,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tourist information center.",
   :rdfs/label      "tourist information center",
   :rdfs/subClassOf :schema/LocalBusiness})

(def ToyStore
  "A toy store."
  {:db/ident        :schema/ToyStore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A toy store.",
   :rdfs/label      "toy store",
   :rdfs/subClassOf :schema/Store})

(def TrainStation
  "A train station."
  {:db/ident        :schema/TrainStation,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A train station.",
   :rdfs/label      "train station",
   :rdfs/subClassOf :schema/CivicStructure})

(def TravelAgency
  "A travel agency."
  {:db/ident        :schema/TravelAgency,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A travel agency.",
   :rdfs/label      "travel agency",
   :rdfs/subClassOf :schema/LocalBusiness})

(def Vehicle
  "A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space."
  {:db/ident :schema/Vehicle,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.",
   :rdfs/label "vehicle",
   :rdfs/subClassOf :schema/Product})

(def Vein
  "A type of blood vessel that specifically carries blood to the heart."
  {:db/ident :schema/Vein,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A type of blood vessel that specifically carries blood to the heart.",
   :rdfs/label "vein",
   :rdfs/subClassOf :schema/Vessel})

(def Vessel
  "A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body."
  {:db/ident :schema/Vessel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body.",
   :rdfs/label "vessel",
   :rdfs/subClassOf :schema/AnatomicalStructure})

(def VideoGame
  "A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device."
  {:db/ident :schema/VideoGame,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.",
   :rdfs/label "video game",
   :rdfs/subClassOf [:schema/Game :schema/SoftwareApplication]})

(def VideoGameSeries
  "A video game series."
  {:db/ident        :schema/VideoGameSeries,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A video game series.",
   :rdfs/label      "video game series",
   :rdfs/subClassOf :schema/CreativeWorkSeries})

(def VideoObject
  "A video file."
  {:db/ident        :schema/VideoObject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A video file.",
   :rdfs/label      "video object",
   :rdfs/subClassOf :schema/MediaObject})

(def VisualArtwork
  "A work of art that is primarily visual in character."
  {:db/ident        :schema/VisualArtwork,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A work of art that is primarily visual in character.",
   :rdfs/label      "visual artwork",
   :rdfs/subClassOf :schema/CreativeWork})

(def Volcano
  "A volcano, like Fuji san."
  {:db/ident        :schema/Volcano,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A volcano, like Fuji san.",
   :rdfs/label      "volcano",
   :rdfs/subClassOf :schema/Landform})

(def Waterfall
  "A waterfall, like Niagara."
  {:db/ident        :schema/Waterfall,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A waterfall, like Niagara.",
   :rdfs/label      "waterfall",
   :rdfs/subClassOf :schema/BodyOfWater})

(def WebPage
  "A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page."
  {:db/ident :schema/WebPage,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.",
   :rdfs/label "web page",
   :rdfs/subClassOf :schema/CreativeWork})

(def WebSite
  "A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs."
  {:db/ident :schema/WebSite,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.",
   :rdfs/label "web site",
   :rdfs/subClassOf :schema/CreativeWork})

(def Winery
  "A winery."
  {:db/ident        :schema/Winery,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A winery.",
   :rdfs/label      "winery",
   :rdfs/subClassOf :schema/FoodEstablishment})

(def WorkersUnion
  "A Workers Union (also known as a Labor Union, Labour Union, or Trade Union) is an organization that promotes the interests of its worker members by collectively bargaining with management, organizing, and political lobbying."
  {:db/ident :schema/WorkersUnion,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Workers Union (also known as a Labor Union, Labour Union, or Trade Union) is an organization that promotes the interests of its worker members by collectively bargaining with management, organizing, and political lobbying.",
   :rdfs/label "workers union",
   :rdfs/subClassOf :schema/Organization})

(def Zoo
  "A zoo."
  {:db/ident        :schema/Zoo,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A zoo.",
   :rdfs/label      "zoo",
   :rdfs/subClassOf :schema/CivicStructure})

(def about
  "The subject matter of the content."
  {:db/ident      :schema/about,
   :owl/inverseOf :schema/subjectOf,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/comment  "The subject matter of the content.",
   :rdfs/domain   {:owl/unionOf [:schema/CreativeWork :schema/Event],
                   :rdf/type    :owl/Class},
   :rdfs/label    "about",
   :rdfs/range    :schema/Thing})

(def actor
  "An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip."
  {:db/ident :schema/actor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.",
   :rdfs/domain {:owl/unionOf [:schema/CreativeWorkSeason
                               :schema/Episode
                               :schema/Movie
                               :schema/MovieSeries
                               :schema/RadioSeries
                               :schema/TVSeries
                               :schema/VideoGame],
                 :rdf/type    :owl/Class},
   :rdfs/label "actor",
   :rdfs/range :schema/Person})

(def affiliation
  "An organization that this person is affiliated with. For example, a school/university, a club, or a team."
  {:db/ident :schema/affiliation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An organization that this person is affiliated with. For example, a school/university, a club, or a team.",
   :rdfs/domain :schema/Person,
   :rdfs/label "affiliation",
   :rdfs/range :schema/Organization,
   :rdfs/subPropertyOf :schema/memberOf})

(def alternateName
  "An alias for the item."
  {:db/ident     :schema/alternateName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "An alias for the item.",
   :rdfs/domain  :schema/Thing,
   :rdfs/label   "alternate name",
   :rdfs/range   :rdf/PlainLiteral})

(def alumniOf
  "An organization that the person is an alumni of."
  {:db/ident      :schema/alumniOf,
   :owl/inverseOf :schema/alumni,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/comment  "An organization that the person is an alumni of.",
   :rdfs/domain   :schema/Person,
   :rdfs/label    "alumni of",
   :rdfs/range    :schema/Organization})

(def author
  "The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably."
  {:db/ident :schema/author,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "author",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def award
  "An award won by or for this item."
  {:db/ident     :schema/award,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "An award won by or for this item.",
   :rdfs/domain  {:owl/unionOf [:schema/CreativeWork
                                :schema/Organization
                                :schema/Person
                                :schema/Product],
                  :rdf/type    :owl/Class},
   :rdfs/label   "award",
   :rdfs/range   :schema/Thing})

(def birthDate
  "Date of birth."
  {:db/ident     :schema/birthDate,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Date of birth.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "birth date",
   :rdfs/range   {:owl/unionOf [:xsd/date
                                :xsd/dateTime
                                :xsd/gYear
                                :xsd/gYearMonth],
                  :rdf/type    :rdfs/Datatype}})

(def birthPlace
  "The place where the person was born."
  {:db/ident     :schema/birthPlace,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The place where the person was born.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "birth place",
   :rdfs/range   :schema/Place})

(def brand
  "The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person."
  {:db/ident :schema/brand,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.",
   :rdfs/domain
   {:owl/unionOf [:schema/Organization :schema/Person :schema/Product],
    :rdf/type    :owl/Class},
   :rdfs/label "brand",
   :rdfs/range {:owl/unionOf [:schema/Brand :schema/Organization],
                :rdf/type    :owl/Class}})

(def broadcastChannelId
  "The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number."
  {:db/ident :schema/broadcastChannelId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.",
   :rdfs/domain :schema/BroadcastChannel,
   :rdfs/label "broadcast channel id",
   :rdfs/range :xsd/string})

(def byArtist
  "The artist that performed this album or recording."
  {:db/ident     :schema/byArtist,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The artist that performed this album or recording.",
   :rdfs/domain  :schema/MusicAlbum,
   :rdfs/label   "by artist",
   :rdfs/range   :schema/MusicGroup})

(def callSign
  "A <a href=\"https://en.wikipedia.org/wiki/Call_sign\">callsign</a>, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles."
  {:db/ident :schema/callSign,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A <a href=\"https://en.wikipedia.org/wiki/Call_sign\">callsign</a>, as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.",
   :rdfs/domain
   {:owl/unionOf [:schema/BroadcastService :schema/Person :schema/Vehicle],
    :rdf/type    :owl/Class},
   :rdfs/label "call sign",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def character
  "Fictional person connected with a creative work."
  {:db/ident     :schema/character,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Fictional person connected with a creative work.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "character",
   :rdfs/range   :schema/Person})

(def children
  "A child of the person."
  {:db/ident     :schema/children,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A child of the person.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "children",
   :rdfs/range   :schema/Person})

(def citation
  "A citation or reference to another creative work, such as another publication, web page, scholarly article, etc."
  {:db/ident :schema/citation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "citation",
   :rdfs/range :schema/CreativeWork})

(def colorist
  "The individual who adds color to inked drawings."
  {:db/ident     :schema/colorist,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The individual who adds color to inked drawings.",
   :rdfs/domain  {:owl/unionOf [:schema/ComicStory :schema/VisualArtwork],
                  :rdf/type    :owl/Class},
   :rdfs/label   "colorist",
   :rdfs/range   :schema/Person})

(def competitor
  "A competitor in a sports event."
  {:db/ident     :schema/competitor,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A competitor in a sports event.",
   :rdfs/domain  :schema/SportsEvent,
   :rdfs/label   "competitor",
   :rdfs/range   {:owl/unionOf [:schema/Person :schema/SportsTeam],
                  :rdf/type    :owl/Class}})

(def composer
  "The person or organization who wrote a composition, or who is the composer of a work performed at some event."
  {:db/ident :schema/composer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The person or organization who wrote a composition, or who is the composer of a work performed at some event.",
   :rdfs/domain {:owl/unionOf [:schema/Event :schema/MusicComposition],
                 :rdf/type    :owl/Class},
   :rdfs/label "composer",
   :rdfs/range {:owl/unionOf [:schema/MusicGroup :schema/Person],
                :rdf/type    :owl/Class}})

(def connectedTo
  "Other anatomical structures to which this structure is connected."
  {:db/ident :schema/connectedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Other anatomical structures to which this structure is connected.",
   :rdfs/domain :schema/AnatomicalStructure,
   :rdfs/label "connected to",
   :rdfs/range :schema/AnatomicalStructure})

(def containedInPlace
  "The basic containment relation between a place and one that contains it."
  {:db/ident :schema/containedInPlace,
   :owl/inverseOf :schema/containsPlace,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The basic containment relation between a place and one that contains it.",
   :rdfs/domain :schema/Place,
   :rdfs/label "contained in place",
   :rdfs/range :schema/Place})

(def containsPlace
  "The basic containment relation between a place and another that it contains."
  {:db/ident :schema/containsPlace,
   :owl/inverseOf :schema/containedInPlace,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The basic containment relation between a place and another that it contains.",
   :rdfs/domain :schema/Place,
   :rdfs/label "contains place",
   :rdfs/range :schema/Place})

(def contentLocation
  "The location depicted or described in the content. For example, the location in a photograph or painting."
  {:db/ident :schema/contentLocation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The location depicted or described in the content. For example, the location in a photograph or painting.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "content location",
   :rdfs/range :schema/Place})

(def contentRating
  "Official rating of a piece of content&#x2014;for example,'MPAA PG-13'."
  {:db/ident :schema/contentRating,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "content rating",
   :rdfs/range :schema/Rating})

(def contributor
  "A secondary contributor to the CreativeWork or Event."
  {:db/ident     :schema/contributor,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A secondary contributor to the CreativeWork or Event.",
   :rdfs/domain  {:owl/unionOf [:schema/CreativeWork :schema/Event],
                  :rdf/type    :owl/Class},
   :rdfs/label   "contributor",
   :rdfs/range   {:owl/unionOf [:schema/Organization :schema/Person],
                  :rdf/type    :owl/Class}})

(def copyrightHolder
  "The party holding the legal copyright to the CreativeWork."
  {:db/ident     :schema/copyrightHolder,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The party holding the legal copyright to the CreativeWork.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "copyright holder",
   :rdfs/range   {:owl/unionOf [:schema/Organization :schema/Person],
                  :rdf/type    :owl/Class}})

(def countryOfOrigin
  "The country of the principal offices of the production company or individual responsible for the movie or program."
  {:db/ident :schema/countryOfOrigin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The country of the principal offices of the production company or individual responsible for the movie or program.",
   :rdfs/domain {:owl/unionOf [:schema/Movie
                               :schema/TVEpisode
                               :schema/TVSeason
                               :schema/TVSeries],
                 :rdf/type    :owl/Class},
   :rdfs/label "country of origin",
   :rdfs/range :schema/Country})

(def creator
  "The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork."
  {:db/ident :schema/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "creator",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def dateCreated
  "The date on which the CreativeWork was created or the item was added to a DataFeed."
  {:db/ident :schema/dateCreated,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The date on which the CreativeWork was created or the item was added to a DataFeed.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "date created",
   :rdfs/range
   {:owl/unionOf [:xsd/date :xsd/dateTime :xsd/gYear :xsd/gYearMonth],
    :rdf/type    :rdfs/Datatype}})

(def datePublished
  "Date of first broadcast/publication."
  {:db/ident     :schema/datePublished,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Date of first broadcast/publication.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "date published",
   :rdfs/range   {:owl/unionOf [:xsd/date
                                :xsd/dateTime
                                :xsd/gYear
                                :xsd/gYearMonth],
                  :rdf/type    :rdfs/Datatype}})

(def deathDate
  "Date of death."
  {:db/ident     :schema/deathDate,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Date of death.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "death date",
   :rdfs/range   {:owl/unionOf [:xsd/date
                                :xsd/dateTime
                                :xsd/gYear
                                :xsd/gYearMonth],
                  :rdf/type    :rdfs/Datatype}})

(def deathPlace
  "The place where the person died."
  {:db/ident     :schema/deathPlace,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The place where the person died.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "death place",
   :rdfs/range   :schema/Place})

(def depth
  "The depth of the item."
  {:db/ident     :schema/depth,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The depth of the item.",
   :rdfs/domain  {:owl/unionOf [:schema/Product :schema/VisualArtwork],
                  :rdf/type    :owl/Class},
   :rdfs/label   "depth",
   :rdfs/range   :schema/QuantitativeValue})

(def director
  "A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip."
  {:db/ident :schema/director,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.",
   :rdfs/domain {:owl/unionOf [:schema/Episode
                               :schema/Movie
                               :schema/MovieSeries
                               :schema/RadioSeries
                               :schema/TVSeries
                               :schema/VideoGame
                               :schema/VideoGameSeries],
                 :rdf/type    :owl/Class},
   :rdfs/label "director",
   :rdfs/range :schema/Person})

(def dissolutionDate
  "The date that this organization was dissolved."
  {:db/ident     :schema/dissolutionDate,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The date that this organization was dissolved.",
   :rdfs/domain  :schema/Organization,
   :rdfs/label   "dissolution date",
   :rdfs/range   {:owl/unionOf [:xsd/date
                                :xsd/dateTime
                                :xsd/gYear
                                :xsd/gYearMonth],
                  :rdf/type    :rdfs/Datatype}})

(def duns
  "The Dun &amp; Bradstreet DUNS number for identifying an organization or business person."
  {:db/ident :schema/duns,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.",
   :rdfs/domain :schema/Organization,
   :rdfs/label "duns",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def duration
  "The duration of the item (movie, audio recording, event, etc.) in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>."
  {:db/ident :schema/duration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The duration of the item (movie, audio recording, event, etc.) in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>.",
   :rdfs/domain
   {:owl/unionOf [:schema/Event :schema/Movie :schema/MusicRelease],
    :rdf/type    :owl/Class},
   :rdfs/label "duration",
   :rdfs/range :xsd/duration})

(def editor
  "Specifies the Person who edited the CreativeWork."
  {:db/ident     :schema/editor,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Specifies the Person who edited the CreativeWork.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "editor",
   :rdfs/range   :schema/Person})

(def elevation
  "The elevation of a location (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>). Values may be of the form 'NUMBER UNIT<em>OF</em>MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters."
  {:db/ident :schema/elevation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The elevation of a location (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>). Values may be of the form 'NUMBER UNIT<em>OF</em>MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.",
   :rdfs/domain :schema/Place,
   :rdfs/label "elevation",
   :rdfs/range :schema/QuantitativeValue})

(def encodingFormat
  "Media type typically expressed using a MIME format (see <a href=\"http://www.iana.org/assignments/media-types/media-types.xhtml\">IANA site</a> and <a href=\"https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types\">MDN reference</a>) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).<br/><br/> In cases where a <a class=\"localLink\" href=\"http://schema.org/CreativeWork\">CreativeWork</a> has several media type representations, <a class=\"localLink\" href=\"http://schema.org/encoding\">encoding</a> can be used to indicate each <a class=\"localLink\" href=\"http://schema.org/MediaObject\">MediaObject</a> alongside particular <a class=\"localLink\" href=\"http://schema.org/encodingFormat\">encodingFormat</a> information.<br/><br/> Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry."
  {:db/ident :schema/encodingFormat,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "Media type typically expressed using a MIME format (see <a href=\"http://www.iana.org/assignments/media-types/media-types.xhtml\">IANA site</a> and <a href=\"https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types\">MDN reference</a>) e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.).<br/><br/>\n\nIn cases where a <a class=\"localLink\" href=\"http://schema.org/CreativeWork\">CreativeWork</a> has several media type representations, <a class=\"localLink\" href=\"http://schema.org/encoding\">encoding</a> can be used to indicate each <a class=\"localLink\" href=\"http://schema.org/MediaObject\">MediaObject</a> alongside particular <a class=\"localLink\" href=\"http://schema.org/encodingFormat\">encodingFormat</a> information.<br/><br/>\n\nUnregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "encoding format",
   :rdfs/range :xsd/string})

(def endDate
  "The end date and time of the item (in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>)."
  {:db/ident :schema/endDate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The end date and time of the item (in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>).",
   :rdfs/domain :schema/Event,
   :rdfs/label "end date",
   :rdfs/range
   {:owl/unionOf [:xsd/date :xsd/dateTime :xsd/gYear :xsd/gYearMonth],
    :rdf/type    :rdfs/Datatype}})

(def exampleOfWork
  "A creative work that this work is an example/instance/realization/derivation of."
  {:db/ident :schema/exampleOfWork,
   :owl/inverseOf :schema/workExample,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A creative work that this work is an example/instance/realization/derivation of.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "example of work",
   :rdfs/range :schema/CreativeWork})

(def familyName
  "Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property."
  {:db/ident :schema/familyName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.",
   :rdfs/domain :schema/Person,
   :rdfs/label "family name",
   :rdfs/range :schema/Thing})

(def faxNumber
  "The fax number."
  {:db/ident     :schema/faxNumber,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The fax number.",
   :rdfs/domain  {:owl/unionOf [:schema/Organization
                                :schema/Person
                                :schema/Place],
                  :rdf/type    :owl/Class},
   :rdfs/label   "fax number",
   :rdfs/range   :xsd/string})

(def founder
  "A person who founded this organization."
  {:db/ident     :schema/founder,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A person who founded this organization.",
   :rdfs/domain  :schema/Organization,
   :rdfs/label   "founder",
   :rdfs/range   :schema/Person})

(def foundingDate
  "The date that this organization was founded."
  {:db/ident     :schema/foundingDate,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The date that this organization was founded.",
   :rdfs/domain  :schema/Organization,
   :rdfs/label   "founding date",
   :rdfs/range   {:owl/unionOf [:xsd/date
                                :xsd/dateTime
                                :xsd/gYear
                                :xsd/gYearMonth],
                  :rdf/type    :rdfs/Datatype}})

(def foundingLocation
  "The place where the Organization was founded."
  {:db/ident     :schema/foundingLocation,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The place where the Organization was founded.",
   :rdfs/domain  :schema/Organization,
   :rdfs/label   "founding location",
   :rdfs/range   :schema/Place})

(def gender
  "Gender of something, typically a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The <a class=\"localLink\" href=\"http://schema.org/gender\">gender</a> property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender <a class=\"localLink\" href=\"http://schema.org/SportsTeam\">SportsTeam</a> can be indicated with a text value of \"Mixed\"."
  {:db/ident :schema/gender,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   "Gender of something, typically a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, but possibly also fictional characters, animals, etc. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender. The <a class=\"localLink\" href=\"http://schema.org/gender\">gender</a> property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender <a class=\"localLink\" href=\"http://schema.org/SportsTeam\">SportsTeam</a> can be indicated with a text value of \"Mixed\".",
   :rdfs/domain :schema/Person,
   :rdfs/label "gender",
   :rdfs/range :schema/Thing})

(def genre
  "Genre of the creative work, broadcast channel or group."
  {:db/ident     :schema/genre,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Genre of the creative work, broadcast channel or group.",
   :rdfs/domain  {:owl/unionOf [:schema/CreativeWork :schema/MusicGroup],
                  :rdf/type    :owl/Class},
   :rdfs/label   "genre",
   :rdfs/range   :schema/Thing})

(def geo
  "The geo coordinates of the place."
  {:db/ident     :schema/geo,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The geo coordinates of the place.",
   :rdfs/domain  :schema/Place,
   :rdfs/label   "geo",
   :rdfs/range   :schema/GeoCoordinates})

(def givenName
  "Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property."
  {:db/ident :schema/givenName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.",
   :rdfs/domain :schema/Person,
   :rdfs/label "given name",
   :rdfs/range :schema/Thing})

(def gtin
  "A Global Trade Item Number (<a href=\"https://www.gs1.org/standards/id-keys/gtin\">GTIN</a>). GTINs identify trade items, including products and services, using numeric identification codes. The <a class=\"localLink\" href=\"http://schema.org/gtin\">gtin</a> property generalizes the earlier <a class=\"localLink\" href=\"http://schema.org/gtin8\">gtin8</a>, <a class=\"localLink\" href=\"http://schema.org/gtin12\">gtin12</a>, <a class=\"localLink\" href=\"http://schema.org/gtin13\">gtin13</a>, and <a class=\"localLink\" href=\"http://schema.org/gtin14\">gtin14</a> properties. The GS1 <a href=\"https://www.gs1.org/standards/Digital-Link/\">digital link specifications</a> express GTINs as URLs. A correct <a class=\"localLink\" href=\"http://schema.org/gtin\">gtin</a> value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a \"GS1 Digital Link\" URL based on such a string. The numeric component should also have a <a href=\"https://www.gs1.org/services/check-digit-calculator\">valid GS1 check digit</a> and meet the other rules for valid GTINs. See also <a href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1's GTIN Summary</a> and <a href=\"https://en.wikipedia.org/wiki/Global_Trade_Item_Number\">Wikipedia</a> for more details. Left-padding of the gtin values is not required or encouraged."
  {:db/ident :schema/gtin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A Global Trade Item Number (<a href=\"https://www.gs1.org/standards/id-keys/gtin\">GTIN</a>). GTINs identify trade items, including products and services, using numeric identification codes. The <a class=\"localLink\" href=\"http://schema.org/gtin\">gtin</a> property generalizes the earlier <a class=\"localLink\" href=\"http://schema.org/gtin8\">gtin8</a>, <a class=\"localLink\" href=\"http://schema.org/gtin12\">gtin12</a>, <a class=\"localLink\" href=\"http://schema.org/gtin13\">gtin13</a>, and <a class=\"localLink\" href=\"http://schema.org/gtin14\">gtin14</a> properties. The GS1 <a href=\"https://www.gs1.org/standards/Digital-Link/\">digital link specifications</a> express GTINs as URLs. A correct <a class=\"localLink\" href=\"http://schema.org/gtin\">gtin</a> value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a \"GS1 Digital Link\" URL based on such a string. The numeric component should also have a <a href=\"https://www.gs1.org/services/check-digit-calculator\">valid GS1 check digit</a> and meet the other rules for valid GTINs. See also <a href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1's GTIN Summary</a> and <a href=\"https://en.wikipedia.org/wiki/Global_Trade_Item_Number\">Wikipedia</a> for more details. Left-padding of the gtin values is not required or encouraged.",
   :rdfs/domain :schema/Product,
   :rdfs/label "gtin",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def hasOccupation
  "The Person's occupation. For past professions, use Role for expressing dates."
  {:db/ident :schema/hasOccupation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The Person's occupation. For past professions, use Role for expressing dates.",
   :rdfs/domain :schema/Person,
   :rdfs/label "has occupation",
   :rdfs/range :schema/Occupation})

(def hasPart
  "Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense)."
  {:db/ident :schema/hasPart,
   :owl/inverseOf :schema/isPartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "has part",
   :rdfs/range :schema/CreativeWork})

(def height
  "The height of the item."
  {:db/ident     :schema/height,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The height of the item.",
   :rdfs/domain  {:owl/unionOf [:schema/Person
                                :schema/Product
                                :schema/VisualArtwork],
                  :rdf/type    :owl/Class},
   :rdfs/label   "height",
   :rdfs/range   :schema/QuantitativeValue})

(def homeLocation
  "A contact location for a person's residence."
  {:db/ident           :schema/homeLocation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "A contact location for a person's residence.",
   :rdfs/domain        :schema/Person,
   :rdfs/label         "home location",
   :rdfs/range         :schema/Place,
   :rdfs/subPropertyOf :schema/location})

(def honorificPrefix
  "An honorific prefix preceding a Person's name such as Dr/Mrs/Mr."
  {:db/ident :schema/honorificPrefix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.",
   :rdfs/domain :schema/Person,
   :rdfs/label "honorific prefix",
   :rdfs/range :schema/Thing})

(def iataCode
  "IATA identifier for an airline or airport."
  {:db/ident     :schema/iataCode,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "IATA identifier for an airline or airport.",
   :rdfs/domain  {:owl/unionOf [:schema/Airline :schema/Airport :schema/City],
                  :rdf/type    :owl/Class},
   :rdfs/label   "iata code",
   :rdfs/range   :xsd/string})

(def icaoCode
  "ICAO identifier for an airport."
  {:db/ident     :schema/icaoCode,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "ICAO identifier for an airport.",
   :rdfs/domain  {:owl/unionOf [:schema/Airline :schema/Airport],
                  :rdf/type    :owl/Class},
   :rdfs/label   "icao code",
   :rdfs/range   :xsd/string})

(def illustrator
  "The illustrator of the book."
  {:db/ident     :schema/illustrator,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The illustrator of the book.",
   :rdfs/domain  :schema/Book,
   :rdfs/label   "illustrator",
   :rdfs/range   :schema/Person})

(def image
  "An image of the item. This can be a <a class=\"localLink\" href=\"http://schema.org/URL\">URL</a> or a fully described <a class=\"localLink\" href=\"http://schema.org/ImageObject\">ImageObject</a>."
  {:db/ident :schema/image,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An image of the item. This can be a <a class=\"localLink\" href=\"http://schema.org/URL\">URL</a> or a fully described <a class=\"localLink\" href=\"http://schema.org/ImageObject\">ImageObject</a>.",
   :rdfs/domain :schema/Thing,
   :rdfs/label "image",
   :rdfs/range :schema/ImageObject})

(def inLanguage
  "The language of the content or performance or used in an action. Please use one of the language codes from the <a href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>. See also <a class=\"localLink\" href=\"http://schema.org/availableLanguage\">availableLanguage</a>."
  {:db/ident :schema/inLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The language of the content or performance or used in an action. Please use one of the language codes from the <a href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>. See also <a class=\"localLink\" href=\"http://schema.org/availableLanguage\">availableLanguage</a>.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "in language",
   :rdfs/range :schema/Language})

(def isBasedOn
  "A resource from which this work is derived or from which it is a modification or adaption."
  {:db/ident :schema/isBasedOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A resource from which this work is derived or from which it is a modification or adaption.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "is based on",
   :rdfs/range :schema/CreativeWork})

(def isPartOf
  "Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of."
  {:db/ident :schema/isPartOf,
   :owl/inverseOf :schema/hasPart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "is part of",
   :rdfs/range :schema/CreativeWork})

(def isbn
  "The ISBN of the book."
  {:db/ident           :schema/isbn,
   :rdf/type           [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment       "The ISBN of the book.",
   :rdfs/domain        :schema/Book,
   :rdfs/label         "isbn",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def issn
  "The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication."
  {:db/ident :schema/issn,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.",
   :rdfs/domain :schema/CreativeWorkSeries,
   :rdfs/label "issn",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def issueNumber
  "Identifies the issue of publication; for example, \"iii\" or \"2\"."
  {:db/ident :schema/issueNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Identifies the issue of publication; for example, \"iii\" or \"2\".",
   :rdfs/domain :schema/PublicationIssue,
   :rdfs/label "issue number",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/position})

(def iswcCode
  "The International Standard Musical Work Code for the composition."
  {:db/ident :schema/iswcCode,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The International Standard Musical Work Code for the composition.",
   :rdfs/domain :schema/MusicComposition,
   :rdfs/label "iswc code",
   :rdfs/range :xsd/string})

(def knowsLanguage
  "Of a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, and less typically of an <a class=\"localLink\" href=\"http://schema.org/Organization\">Organization</a>, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the <a href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>."
  {:db/ident :schema/knowsLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Of a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, and less typically of an <a class=\"localLink\" href=\"http://schema.org/Organization\">Organization</a>, to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the <a href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>.",
   :rdfs/domain {:owl/unionOf [:schema/Organization :schema/Person],
                 :rdf/type    :owl/Class},
   :rdfs/label "knows language",
   :rdfs/range :schema/Language})

(def latitude
  "The latitude of a location. For example <code>37.42242</code> (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>)."
  {:db/ident :schema/latitude,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The latitude of a location. For example <code>37.42242</code> (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>).",
   :rdfs/domain :schema/GeoCoordinates,
   :rdfs/label "latitude",
   :rdfs/range :xsd/double})

(def legalStatus
  "The drug or supplement's legal status, including any controlled substance schedules that apply."
  {:db/ident :schema/legalStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The drug or supplement's legal status, including any controlled substance schedules that apply.",
   :rdfs/domain :schema/MedicalEntity,
   :rdfs/label "legal status",
   :rdfs/range :schema/DrugLegalStatus})

(def leiCode
  "An organization identifier that uniquely identifies a legal entity as defined in ISO 17442."
  {:db/ident :schema/leiCode,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.",
   :rdfs/domain :schema/Organization,
   :rdfs/label "lei code",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/identifier})

(def license
  "A license document that applies to this content, typically indicated by URL."
  {:db/ident :schema/license,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A license document that applies to this content, typically indicated by URL.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "license",
   :rdfs/range :schema/CreativeWork})

(def location
  "The location of for example where the event is happening, an organization is located, or where an action takes place."
  {:db/ident :schema/location,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The location of for example where the event is happening, an organization is located, or where an action takes place.",
   :rdfs/domain {:owl/unionOf [:schema/Event :schema/Organization],
                 :rdf/type    :owl/Class},
   :rdfs/label "location",
   :rdfs/range :schema/Place})

(def locationCreated
  "The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork."
  {:db/ident :schema/locationCreated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "location created",
   :rdfs/range :schema/Place})

(def logo
  "An associated logo."
  {:db/ident           :schema/logo,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "An associated logo.",
   :rdfs/domain        {:owl/unionOf [:schema/Brand
                                      :schema/Organization
                                      :schema/Place
                                      :schema/Product],
                        :rdf/type    :owl/Class},
   :rdfs/label         "logo",
   :rdfs/range         :schema/ImageObject,
   :rdfs/subPropertyOf :schema/image})

(def longitude
  "The longitude of a location. For example <code>-122.08585</code> (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>)."
  {:db/ident :schema/longitude,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The longitude of a location. For example <code>-122.08585</code> (<a href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>).",
   :rdfs/domain :schema/GeoCoordinates,
   :rdfs/label "longitude",
   :rdfs/range :xsd/double})

(def lyricist
  "The person who wrote the words."
  {:db/ident     :schema/lyricist,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The person who wrote the words.",
   :rdfs/domain  :schema/MusicComposition,
   :rdfs/label   "lyricist",
   :rdfs/range   {:owl/unionOf [:schema/MusicGroup :schema/Person],
                  :rdf/type    :owl/Class}})

(def material
  "A material that something is made from, e.g. leather, wool, cotton, paper."
  {:db/ident :schema/material,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A material that something is made from, e.g. leather, wool, cotton, paper.",
   :rdfs/domain {:owl/unionOf [:schema/CreativeWork :schema/Product],
                 :rdf/type    :owl/Class},
   :rdfs/label "material",
   :rdfs/range :schema/Thing})

(def maxValue
  "The upper value of some characteristic or property."
  {:db/ident     :schema/maxValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The upper value of some characteristic or property.",
   :rdfs/domain  :schema/QuantitativeValue,
   :rdfs/label   "max value",
   :rdfs/range   :xsd/decimal})

(def memberOf
  "An Organization (or ProgramMembership) to which this Person or Organization belongs."
  {:db/ident :schema/memberOf,
   :owl/inverseOf :schema/member,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An Organization (or ProgramMembership) to which this Person or Organization belongs.",
   :rdfs/domain {:owl/unionOf [:schema/Organization :schema/Person],
                 :rdf/type    :owl/Class},
   :rdfs/label "member of",
   :rdfs/range :schema/Organization})

(def minValue
  "The lower value of some characteristic or property."
  {:db/ident     :schema/minValue,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The lower value of some characteristic or property.",
   :rdfs/domain  :schema/QuantitativeValue,
   :rdfs/label   "min value",
   :rdfs/range   :xsd/decimal})

(def musicBy
  "The composer of the soundtrack."
  {:db/ident     :schema/musicBy,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The composer of the soundtrack.",
   :rdfs/domain  {:owl/unionOf [:schema/Episode
                                :schema/Movie
                                :schema/MovieSeries
                                :schema/RadioSeries
                                :schema/TVSeries
                                :schema/VideoGame
                                :schema/VideoGameSeries],
                  :rdf/type    :owl/Class},
   :rdfs/label   "music by",
   :rdfs/range   {:owl/unionOf [:schema/MusicGroup :schema/Person],
                  :rdf/type    :owl/Class}})

(def musicReleaseFormat
  "Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.)."
  {:db/ident :schema/musicReleaseFormat,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).",
   :rdfs/domain :schema/MusicRelease,
   :rdfs/label "music release format",
   :rdfs/range :schema/Thing})

(def nationality
  "Nationality of the person."
  {:db/ident     :schema/nationality,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Nationality of the person.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "nationality",
   :rdfs/range   :schema/Country})

(def netWorth
  "The total financial value of the person as calculated by subtracting assets from liabilities."
  {:db/ident :schema/netWorth,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The total financial value of the person as calculated by subtracting assets from liabilities.",
   :rdfs/domain :schema/Person,
   :rdfs/label "net worth",
   :rdfs/range :schema/QuantitativeValue})

(def numberOfEmployees
  "The number of employees in an organization e.g. business."
  {:db/ident     :schema/numberOfEmployees,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The number of employees in an organization e.g. business.",
   :rdfs/domain  :schema/Organization,
   :rdfs/label   "number of employees",
   :rdfs/range   :schema/QuantitativeValue})

(def numberOfEpisodes
  "The number of episodes in this season or series."
  {:db/ident     :schema/numberOfEpisodes,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The number of episodes in this season or series.",
   :rdfs/domain  {:owl/unionOf [:schema/CreativeWorkSeason
                                :schema/RadioSeries
                                :schema/TVSeries
                                :schema/VideoGameSeries],
                  :rdf/type    :owl/Class},
   :rdfs/label   "number of episodes",
   :rdfs/range   :xsd/integer})

(def numberOfPages
  "The number of pages in the book."
  {:db/ident     :schema/numberOfPages,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The number of pages in the book.",
   :rdfs/domain  :schema/Book,
   :rdfs/label   "number of pages",
   :rdfs/range   :xsd/integer})

(def numberOfSeasons
  "The number of seasons in this series."
  {:db/ident     :schema/numberOfSeasons,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The number of seasons in this series.",
   :rdfs/domain  {:owl/unionOf [:schema/RadioSeries
                                :schema/TVSeries
                                :schema/VideoGameSeries],
                  :rdf/type    :owl/Class},
   :rdfs/label   "number of seasons",
   :rdfs/range   :xsd/integer})

(def operatingSystem
  "Operating systems supported (Windows 7, OSX 10.6, Android 1.6)."
  {:db/ident :schema/operatingSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Operating systems supported (Windows 7, OSX 10.6, Android 1.6).",
   :rdfs/domain :schema/SoftwareApplication,
   :rdfs/label "operating system",
   :rdfs/range :schema/SoftwareApplication})

(def organizer
  "An organizer of an Event."
  {:db/ident     :schema/organizer,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "An organizer of an Event.",
   :rdfs/domain  :schema/Event,
   :rdfs/label   "organizer",
   :rdfs/range   {:owl/unionOf [:schema/MusicGroup :schema/Person],
                  :rdf/type    :owl/Class}})

(def owns
  "Products owned by the organization or person."
  {:db/ident     :schema/owns,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Products owned by the organization or person.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "owns",
   :rdfs/range   :schema/Product})

(def pagination
  "Any description of pages that is not separated into pageStart and pageEnd; for example, \"1-6, 9, 55\" or \"10-12, 46-49\"."
  {:db/ident :schema/pagination,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Any description of pages that is not separated into pageStart and pageEnd; for example, \"1-6, 9, 55\" or \"10-12, 46-49\".",
   :rdfs/domain {:owl/unionOf [:schema/Article
                               :schema/PublicationIssue
                               :schema/PublicationVolume],
                 :rdf/type    :owl/Class},
   :rdfs/label "pagination",
   :rdfs/range :xsd/string})

(def parent
  "A parent of this person."
  {:db/ident     :schema/parent,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A parent of this person.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "parent",
   :rdfs/range   :schema/Person})

(def parentOrganization
  "The larger organization that this organization is a <a class=\"localLink\" href=\"http://schema.org/subOrganization\">subOrganization</a> of, if any."
  {:db/ident :schema/parentOrganization,
   :owl/inverseOf :schema/subOrganization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The larger organization that this organization is a <a class=\"localLink\" href=\"http://schema.org/subOrganization\">subOrganization</a> of, if any.",
   :rdfs/domain :schema/Organization,
   :rdfs/label "parent organization",
   :rdfs/range :schema/Organization})

(def partOfSeason
  "The season to which this episode belongs."
  {:db/ident           :schema/partOfSeason,
   :rdf/type           [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment       "The season to which this episode belongs.",
   :rdfs/domain        :schema/Episode,
   :rdfs/label         "part of season",
   :rdfs/range         :schema/CreativeWorkSeason,
   :rdfs/subPropertyOf :schema/isPartOf})

(def partOfSeries
  "The series to which this episode or season belongs."
  {:db/ident           :schema/partOfSeries,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "The series to which this episode or season belongs.",
   :rdfs/domain        {:owl/unionOf [:schema/CreativeWorkSeason
                                      :schema/Episode],
                        :rdf/type    :owl/Class},
   :rdfs/label         "part of series",
   :rdfs/range         :schema/CreativeWorkSeries,
   :rdfs/subPropertyOf :schema/isPartOf})

(def position
  "The position of an item in a series or sequence of items."
  {:db/ident     :schema/position,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The position of an item in a series or sequence of items.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "position",
   :rdfs/range   :xsd/integer})

(def possibleTreatment
  "A possible treatment to address this condition, sign or symptom."
  {:db/ident :schema/possibleTreatment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A possible treatment to address this condition, sign or symptom.",
   :rdfs/domain {:owl/unionOf [:schema/MedicalCondition
                               :schema/MedicalSignOrSymptom],
                 :rdf/type    :owl/Class},
   :rdfs/label "possible treatment",
   :rdfs/range :schema/MedicalTherapy})

(def producer
  "The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.)."
  {:db/ident :schema/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "producer",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def productionCompany
  "The production company or studio responsible for the item e.g. series, video game, episode etc."
  {:db/ident :schema/productionCompany,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The production company or studio responsible for the item e.g. series, video game, episode etc.",
   :rdfs/domain {:owl/unionOf [:schema/CreativeWorkSeason
                               :schema/Episode
                               :schema/Movie
                               :schema/MovieSeries
                               :schema/RadioSeries
                               :schema/TVSeries
                               :schema/VideoGameSeries],
                 :rdf/type    :owl/Class},
   :rdfs/label "production company",
   :rdfs/range :schema/Organization})

(def provider
  "The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller."
  {:db/ident :schema/provider,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "provider",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def publisher
  "The publisher of the creative work."
  {:db/ident     :schema/publisher,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The publisher of the creative work.",
   :rdfs/domain  :schema/CreativeWork,
   :rdfs/label   "publisher",
   :rdfs/range   {:owl/unionOf [:schema/Organization :schema/Person],
                  :rdf/type    :owl/Class}})

(def recordLabel
  "The label that issued the release."
  {:db/ident     :schema/recordLabel,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The label that issued the release.",
   :rdfs/domain  :schema/MusicRelease,
   :rdfs/label   "record label",
   :rdfs/range   :schema/Organization})

(def releaseOf
  "The album this is a release of."
  {:db/ident      :schema/releaseOf,
   :owl/inverseOf :schema/albumRelease,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/comment  "The album this is a release of.",
   :rdfs/domain   :schema/MusicRelease,
   :rdfs/label    "release of",
   :rdfs/range    :schema/MusicAlbum})

(def relevantSpecialty
  "If applicable, a medical specialty in which this entity is relevant."
  {:db/ident :schema/relevantSpecialty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "If applicable, a medical specialty in which this entity is relevant.",
   :rdfs/domain :schema/MedicalEntity,
   :rdfs/label "relevant specialty",
   :rdfs/range :schema/MedicalSpecialty})

(def riskFactor
  "A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age, coexisting condition."
  {:db/ident :schema/riskFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.",
   :rdfs/domain :schema/MedicalCondition,
   :rdfs/label "risk factor",
   :rdfs/range :schema/Thing})

(def sameAs
  "URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website."
  {:db/ident :schema/sameAs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.",
   :rdfs/domain :schema/Thing,
   :rdfs/label "same as",
   :rdfs/range :xsd/anyURI})

(def servesCuisine
  "The cuisine of the restaurant."
  {:db/ident     :schema/servesCuisine,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The cuisine of the restaurant.",
   :rdfs/domain  :schema/FoodEstablishment,
   :rdfs/label   "serves cuisine",
   :rdfs/range   :schema/Thing})

(def signOrSymptom
  "A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition."
  {:db/ident :schema/signOrSymptom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.",
   :rdfs/domain :schema/MedicalCondition,
   :rdfs/label "sign or symptom",
   :rdfs/range :schema/MedicalSignOrSymptom})

(def sponsor
  "A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event."
  {:db/ident :schema/sponsor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.",
   :rdfs/domain
   {:owl/unionOf [:schema/CreativeWork :schema/Event :schema/Organization],
    :rdf/type    :owl/Class},
   :rdfs/label "sponsor",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def sport
  "A type of sport (e.g. Baseball)."
  {:db/ident     :schema/sport,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A type of sport (e.g. Baseball).",
   :rdfs/domain  {:owl/unionOf [:schema/SportsEvent :schema/SportsOrganization],
                  :rdf/type    :owl/Class},
   :rdfs/label   "sport",
   :rdfs/range   :schema/Thing})

(def spouse
  "The person's spouse."
  {:db/ident     :schema/spouse,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "The person's spouse.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "spouse",
   :rdfs/range   :schema/Person})

(def startDate
  "The start date and time of the item (in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>)."
  {:db/ident :schema/startDate,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The start date and time of the item (in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>).",
   :rdfs/domain :schema/Event,
   :rdfs/label "start date",
   :rdfs/range
   {:owl/unionOf [:xsd/date :xsd/dateTime :xsd/gYear :xsd/gYearMonth],
    :rdf/type    :rdfs/Datatype}})

(def subEvent
  "An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference."
  {:db/ident :schema/subEvent,
   :owl/inverseOf :schema/superEvent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.",
   :rdfs/domain :schema/Event,
   :rdfs/label "sub event",
   :rdfs/range :schema/Event})

(def subOrganization
  "A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property."
  {:db/ident :schema/subOrganization,
   :owl/inverseOf :schema/parentOrganization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.",
   :rdfs/domain :schema/Organization,
   :rdfs/label "sub organization",
   :rdfs/range :schema/Organization})

(def superEvent
  "An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent."
  {:db/ident :schema/superEvent,
   :owl/inverseOf :schema/subEvent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.",
   :rdfs/domain :schema/Event,
   :rdfs/label "super event",
   :rdfs/range :schema/Event})

(def telephone
  "The telephone number."
  {:db/ident     :schema/telephone,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The telephone number.",
   :rdfs/domain  {:owl/unionOf [:schema/Organization
                                :schema/Person
                                :schema/Place],
                  :rdf/type    :owl/Class},
   :rdfs/label   "telephone",
   :rdfs/range   :xsd/string})

(def translator
  "Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event."
  {:db/ident :schema/translator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.",
   :rdfs/domain {:owl/unionOf [:schema/CreativeWork :schema/Event],
                 :rdf/type    :owl/Class},
   :rdfs/label "translator",
   :rdfs/range {:owl/unionOf [:schema/Organization :schema/Person],
                :rdf/type    :owl/Class}})

(def unitCode
  "The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon."
  {:db/ident :schema/unitCode,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   "The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.",
   :rdfs/domain :schema/QuantitativeValue,
   :rdfs/label "unit code",
   :rdfs/range :schema/Thing})

(def url
  "URL of the item."
  {:db/ident     :schema/url,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "URL of the item.",
   :rdfs/domain  :schema/Thing,
   :rdfs/label   "url",
   :rdfs/range   :xsd/anyURI})

(def value
  "The value of the quantitative value or property value node.<br/><br/> <ul> <li>For <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> and <a class=\"localLink\" href=\"http://schema.org/MonetaryAmount\">MonetaryAmount</a>, the recommended type for values is 'Number'.</li> <li>For <a class=\"localLink\" href=\"http://schema.org/PropertyValue\">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li> <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li> <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li> </ul>"
  {:db/ident :schema/value,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "The value of the quantitative value or property value node.<br/><br/>\n\n<ul>\n<li>For <a class=\"localLink\" href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> and <a class=\"localLink\" href=\"http://schema.org/MonetaryAmount\">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>\n<li>For <a class=\"localLink\" href=\"http://schema.org/PropertyValue\">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>\n<li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>\n<li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>\n</ul>\n",
   :rdfs/domain :schema/QuantitativeValue,
   :rdfs/label "value",
   :rdfs/range :xsd/decimal})

(def volumeNumber
  "Identifies the volume of publication or multi-part work; for example, \"iii\" or \"2\"."
  {:db/ident :schema/volumeNumber,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Identifies the volume of publication or multi-part work; for example, \"iii\" or \"2\".",
   :rdfs/domain :schema/PublicationVolume,
   :rdfs/label "volume number",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :schema/position})

(def weight
  "The weight of the product or person."
  {:db/ident     :schema/weight,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The weight of the product or person.",
   :rdfs/domain  {:owl/unionOf [:schema/Person :schema/Product],
                  :rdf/type    :owl/Class},
   :rdfs/label   "weight",
   :rdfs/range   :schema/QuantitativeValue})

(def width
  "The width of the item."
  {:db/ident     :schema/width,
   :rdf/type     [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment "The width of the item.",
   :rdfs/domain  {:owl/unionOf [:schema/Product :schema/VisualArtwork],
                  :rdf/type    :owl/Class},
   :rdfs/label   "width",
   :rdfs/range   :schema/QuantitativeValue})

(def workExample
  "Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook."
  {:db/ident :schema/workExample,
   :owl/inverseOf :schema/exampleOfWork,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.",
   :rdfs/domain :schema/CreativeWork,
   :rdfs/label "work example",
   :rdfs/range :schema/CreativeWork})

(def worksFor
  "Organizations that the person works for."
  {:db/ident     :schema/worksFor,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Organizations that the person works for.",
   :rdfs/domain  :schema/Person,
   :rdfs/label   "works for",
   :rdfs/range   :schema/Person})

(def ^{:private true} BioChemEntity
  "Any biological, chemical, or biochemical thing. For example: a protein; a gene; a chemical; a synthetic chemical."
  {:db/ident :bioschema/BioChemEntity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any biological, chemical, or biochemical thing. For example: a protein; a gene; a chemical; a synthetic chemical."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "biology chemistry entity"},
   :rdfs/subClassOf :schema/Thing})

(def ^{:private true} ChemicalSubstance
  "A chemical substance."
  {:db/ident        :bioschema/ChemicalSubstance,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A chemical substance."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "chemical substance"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def ^{:private true} Gene
  "A discrete unit of inheritance which affects one or more biological traits ."
  {:db/ident :bioschema/Gene,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A discrete unit of inheritance which affects one or more biological traits ."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gene"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def ^{:private true} MolecularEntity
  "Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity."
  {:db/ident :bioschema/MolecularEntity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "molecular entity"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def ^{:private true} Protein
  "Protein is here used in its widest possible definition, as classes of amino acid based molecules. Amyloid-beta Protein in human (UniProt P05067), eukaryota (e.g. an OrthoDB group) or even a single molecule that one can point to are all of type schema:Protein. A protein can thus be a subclass of another protein, e.g. schema:Protein as a UniProt record can have multiple isoforms inside it which would also be schema:Protein. They can be imagined, synthetic, hypothetical or naturally occurring."
  {:db/ident :bioschema/Protein,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Protein is here used in its widest possible definition, as classes of amino acid based molecules. Amyloid-beta Protein in human (UniProt P05067), eukaryota (e.g. an OrthoDB group) or even a single molecule that one can point to are all of type schema:Protein. A protein can thus be a subclass of another protein, e.g. schema:Protein as a UniProt record can have multiple isoforms inside it which would also be schema:Protein. They can be imagined, synthetic, hypothetical or naturally occurring."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "protein"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def ^{:private true} Taxon
  "A set of organisms asserted to represent a natural cohesive biological unit."
  {:db/ident :bioschema/Taxon,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A set of organisms asserted to represent a natural cohesive biological unit."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "taxon"},
   :rdfs/subClassOf :schema/Thing})

(def ^{:private true} bioChemInteraction
  {:db/ident    :bioschema/bioChemInteraction,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/BioChemEntity,
   :rdfs/range  :bioschema/BioChemEntity})

(def ^{:private true} encodesBioChemEntity
  {:db/ident      :bioschema/encodesBioChemEntity,
   :owl/inverseOf :bioschema/isEncodedByBioChemEntity,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/domain   :bioschema/Gene,
   :rdfs/range    :bioschema/BioChemEntity})

(def ^{:private true} expressedIn
  {:db/ident    :bioschema/expressedIn,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/Gene,
   :rdfs/range  :schema/Thing})

(def ^{:private true} hasMolecularFunction
  {:db/ident    :bioschema/hasMolecularFunction,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/BioChemEntity,
   :rdfs/range  :schema/Thing})

(def ^{:private true} inChI
  {:db/ident    :bioschema/inChI,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :bioschema/MolecularEntity,
   :rdfs/range  :xsd/string})

(def ^{:private true} inChIKey
  {:db/ident    :bioschema/inChIKey,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :bioschema/MolecularEntity,
   :rdfs/range  :xsd/string})

(def ^{:private true} isEncodedByBioChemEntity
  {:db/ident      :bioschema/isEncodedByBioChemEntity,
   :owl/inverseOf :bioschema/encodesBioChemEntity,
   :rdf/type      :owl/ObjectProperty,
   :rdfs/domain   :bioschema/BioChemEntity,
   :rdfs/range    :bioschema/Gene})

(def ^{:private true} isInvolvedInBiologicalProcess
  {:db/ident    :bioschema/isInvolvedInBiologicalProcess,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/BioChemEntity,
   :rdfs/range  :schema/Thing})

(def ^{:private true} isLocatedInSubcellularLocation
  {:db/ident    :bioschema/isLocatedInSubcellularLocation,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/BioChemEntity,
   :rdfs/range  :schema/Thing})

(def ^{:private true} molecularFormula
  {:db/ident    :bioschema/molecularFormula,
   :rdf/type    [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :bioschema/MolecularEntity,
   :rdfs/range  :xsd/string})

(def ^{:private true} parentTaxon
  {:db/ident    :bioschema/parentTaxon,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :bioschema/Taxon,
   :rdfs/range  :bioschema/Taxon})

(def ^{:private true} smiles
  {:db/ident    :bioschema/smiles,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain :bioschema/MolecularEntity,
   :rdfs/range  :xsd/string})

(def ^{:private true} taxonRank
  {:db/ident    :bioschema/taxonRank,
   :rdf/type    [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :bioschema/Taxon,
   :rdfs/range  :schema/Thing})