# Family-MemberService

API for the Member Service

## Application Structure

* `src/main/java/com/empowerhack/family/memberservice`
   * `/data`
      * `Sample.java` - Dummy data during **In-memory** usage
   * `/entity` - Domain Model
   * `/filter` - Runs on every **Request** and injects Application Version (from `/resources/application.yml` Config) into Response Header
   * `/repository` - Manage the Domain Model
* `src/main/resources`
   * `application.yml` - Application config (contains `dev` & `prod`

## API Usage examples

Using HAL, so resources and functionality should be auto discoverable.

### Request Header

Send `Content-type: application/json`

### Response Header

Always contains version `X-Application-Version: vX.Y.Z` (eg. v1.2.3)

### Root of API

#### Request `[GET] /`

Response

```json
{
  "_links": {
    "members": {
      "href": "http://localhost:8081/members{?page,size,sort}",
      "templated": true
    },
    "profile": {
      "href": "http://localhost:8081/profile"
    }
  }
}
```

### List Members

#### Request '[GET] /members'

Response

```json
{
  "_embedded": {
    "members": [
      {
        "name": "Member 1",
        "email": "member@test.com",
        "isPrivate": true,
        "availability": 50,
        "urls": {
          "LinkedIn": "http://linkedin.com/member1",
          "Twitter": "http://twitter.com/member1",
          "Facebook": "http://facebook.com/member1"
        },
        "skills": [
          "Java",
          "PHP",
          "DevOPs"
        ],
        "interests": [
          "Learning",
          "Networking"
        ],
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/1"
          },
          "member": {
            "href": "http://localhost:8081/members/1"
          }
        }
      },
      {
        "name": "Member 2",
        "email": "member2@test.com",
        "isPrivate": false,
        "availability": 90,
        "urls": {
          "LinkedIn": "http://linkedin.com/member2",
          "Twitter": "http://twitter.com/member2",
          "Facebook": "http://facebook.com/member2"
        },
        "skills": [
          "JS",
          "Ruby",
          "UI"
        ],
        "interests": [
          "New Technology",
          "Charity",
          "NGO"
        ],
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/2"
          },
          "member": {
            "href": "http://localhost:8081/members/2"
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8081/members"
    },
    "profile": {
      "href": "http://localhost:8081/profile/members"
    },
    "search": {
      "href": "http://localhost:8081/members/search"
    }
  },
  "page": {
    "size": 20,
    "totalElements": 2,
    "totalPages": 1,
    "number": 0
  }
}
```

### Create a Member

#### Request '[POST] /members'

```json
{
  "name": "test name",
  "email": "wmail@email.com"
}
```

Response

```json
{
  "name": "test name",
  "email": "email@email.com",
  "isPrivate": true,
  "_links": {
    "self": {
      "href": "http://localhost:8081/members/1"
    },
    "member": {
      "href": "http://localhost:8081/members/1"
    }
  }
}
```

### Get a specific Member

#### Request '[GET] /members/1'

Response

```json
{
  "name": "Member 1",
  "email": "member@test.com",
  "isPrivate": true,
  "availability": 50,
  "urls": {
    "LinkedIn": "http://linkedin.com/member1",
    "Twitter": "http://twitter.com/member1",
    "Facebook": "http://facebook.com/member1"
  },
  "skills": [
    "Java",
    "PHP",
    "DevOPs"
  ],
  "interests": [
    "Learning",
    "Networking"
  ],
  "_links": {
    "self": {
      "href": "http://localhost:8081/members/1"
    },
    "member": {
      "href": "http://localhost:8081/members/1"
    }
  }
}
```

### Search

### Request '[GET] /members/search/findByName?name=Member'

Response

```json
{
  "_embedded": {
    "members": [
      {
        "name": "Member 1",
        "email": "member@test.com",
        "isPrivate": true,
        "availability": 50,
        "urls": {
          "LinkedIn": "http://linkedin.com/member1",
          "Twitter": "http://twitter.com/member1",
          "Facebook": "http://facebook.com/member1"
        },
        "skills": [
          "Java",
          "PHP",
          "DevOPs"
        ],
        "interests": [
          "Learning",
          "Networking"
        ],
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/1"
          },
          "member": {
            "href": "http://localhost:8081/members/1"
          }
        }
      },
      {
        "name": "Member 2",
        "email": "member2@test.com",
        "isPrivate": false,
        "availability": 90,
        "urls": {
          "LinkedIn": "http://linkedin.com/member2",
          "Twitter": "http://twitter.com/member2",
          "Facebook": "http://facebook.com/member2"
        },
        "skills": [
          "JS",
          "Ruby",
          "UI"
        ],
        "interests": [
          "New Technology",
          "Charity",
          "NGO"
        ],
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/2"
          },
          "member": {
            "href": "http://localhost:8081/members/2"
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8081/members/search/findByName?name=Member"
    }
  }
}
```

---

## Run locally

### Dependencies

* Java v8+
* Maven

### Installation

#### Maven / Spring boot plugin (preferred)

* `mvn spring-boot:run`

*OR*

#### Old school approach

* `mvn package`
* `java -jar target/family-memberservice-0.0.1-SNAPSHOT.jar`

After following either step, the Webserver will be running on `http://localhost:8081`
