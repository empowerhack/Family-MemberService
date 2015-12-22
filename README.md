# Family-MemberService

API for the Member Service

## API Usage examples

Using HAL, so resources and functionality should be auto discoverable.

Request `[GET] /`

Response

```json
{
  "_links": {
    "members": {
      "href": "http://localhost:8081/members{?page,size,sort}",
      "templated": true
    },
    "urls": {
      "href": "http://localhost:8081/urls{?page,size,sort}",
      "templated": true
    },
    "skills": {
      "href": "http://localhost:8081/skills{?page,size,sort}",
      "templated": true
    },
    "profile": {
      "href": "http://localhost:8081/profile"
    }
  }
}
```

Request '[GET] /members'

Response

```json
{
  "_embedded": {
    "members": []
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
    "totalElements": 0,
    "totalPages": 0,
    "number": 0
  }
}
```

Request '[POST] /members'

```json
{
  "name": "test name"
}
```

Response

```json
{
  "name": "test name",
  "description": null,
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
