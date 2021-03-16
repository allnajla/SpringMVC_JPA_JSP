<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>${title}</title>
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<div>
   <form action="/Products" method="get">
  
    <table >
     <tr>
       <td>Mot Clé</td>
       <td><input type="text" name="motCle" value="${model.ref}"/></td>
       <td><input type="submit" value="chercher" name="action"/></td>
     </tr>
      </table>
     
 
 <div>
 <table >
 
  	 <tr>
       <td>REF:</td>
       <td>${produit.reference}<input type="hidden" name="reference" value="${produit.reference }" /></td>
       <td></td>
     </tr>
     <tr>
       <td>Designation:</td>
       <td><input type="text" name="designation"  value="${produit.designation}"/></td>
       <td></td>
     </tr>
     
     <tr>
       <td>Prix:</td>
       <td><input type="text" name="prix"  value="${produit.prix}" /></td>
       <td></td>
     </tr>
     
      <tr>
       <td>Quantité:</td>
       <td><input type="text" name="quantite" value="${produit.quantite}"  /></td>
       <td></td>
     </tr>
     
      <tr>
     <td><input type="submit" name="action" value="save"/></td>
     </tr>
  </table>
  
</div>

<div>
<table class="table1">
       <tr>
         <th>REF</th><th>DES</th><th>PRIX</th><th>QUANTITE</th>
        </tr>
          <c:forEach items="${produits}" var="p">
            <tr>
              <td>${p.reference}</td>
              <td>${p.designation}</td>
              <td>${p.prix}</td>
              <td>${p.quantite}</td>
            </tr>
          </c:forEach>
</table>
</div>
    
 </form>
</div>
</body>
</html>