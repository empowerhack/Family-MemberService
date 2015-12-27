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
   * `aaplication.yml` - Application config

## API Usage examples

Using HAL, so resources and functionality should be auto discoverable.

### Header

Always contains version `X-Application-Version: v0.2.1v`

### Request `[GET] /`

Response

```json
{
  "_links": {
    "urls": {
      "href": "http://localhost:8081/urls{?page,size,sort}",
      "templated": true
    },
    "members": {
      "href": "http://localhost:8081/members{?page,size,sort}",
      "templated": true
    },
    "skills": {
      "href": "http://localhost:8081/skills{?page,size,sort}",
      "templated": true
    },
    "interests": {
      "href": "http://localhost:8081/interests{?page,size,sort}",
      "templated": true
    },
    "profile": {
      "href": "http://localhost:8081/profile"
    }
  }
}
```

### Request '[GET] /members'

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
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/1"
          },
          "member": {
            "href": "http://localhost:8081/members/1"
          },
          "skills": {
            "href": "http://localhost:8081/members/1/skills"
          },
          "urls": {
            "href": "http://localhost:8081/members/1/urls"
          },
          "interests": {
            "href": "http://localhost:8081/members/1/interests"
          }
        }
      },
      {
        "name": "Member 2",
        "email": "member2@test.com",
        "isPrivate": false,
        "availability": 90,
        "_links": {
          "self": {
            "href": "http://localhost:8081/members/2"
          },
          "member": {
            "href": "http://localhost:8081/members/2"
          },
          "skills": {
            "href": "http://localhost:8081/members/2/skills"
          },
          "urls": {
            "href": "http://localhost:8081/members/2/urls"
          },
          "interests": {
            "href": "http://localhost:8081/members/2/interests"
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

### Request '[POST] /members'

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
    },
    "skills": {
      "href": "http://localhost:8081/members/1/skills"
    },
    "urls": {
      "href": "http://localhost:8081/members/1/urls"
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
