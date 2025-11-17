<table border="1">
  <tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th></tr>
  <c:forEach var="b" items="${books}">
    <tr>
      <td>${b.bookId}</td>
      <td>${b.title}</td>
      <td>${b.author}</td>
      <td>${b.price}</td>
    </tr>
  </c:forEach>
</table>
