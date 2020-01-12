$(function() {
  post("/account/get", {id:1}, function(v) {
    console.log(v);
    var p = Object.keys(v);
    for (var i = 0; i < p.length; i++) {
      $("body").append(v[p[i]]+"</br>");
    }
  });
})