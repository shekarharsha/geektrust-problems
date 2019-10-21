[
  {
    '$project': {
      'title': 1, 
      'spoken_languages': 1, 
      'original_language': 1
    }
  }, {
    '$group': {
      '_id': '$original_language', 
      'count': {
        '$sum': 1
      }
    }
  }, {
    '$sort': {
      'count': -1
    }
  }
]