function post(path, data, f) {
  $.ajax({
    url:path,
    type:'POST',
    contentType: 'application/json; charset=UTF-8',
    async:false,
    dataType:'json',
    data:JSON.stringify(data),
    success: f
  })
}