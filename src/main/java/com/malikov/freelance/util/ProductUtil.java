package com.malikov.freelance.util;

public class ProductUtil {

//    public static Product createNewFromTo(ProductTo productTo) {
//        return new Product(null, productTo.getName(), productTo.getPrice(), false, productTo.getQuantity(), false,
//                null, null);
//    }
//
////    public static ProductTo asTo(Product product){
////        return new ProductTo(product.getId(), product.getName(), product.getPrice(), product.getQuantity());
////    }
//
//    public static Product updateFromTo(Product product, ProductTo productTo) {
//        product.setName(productTo.getName());
//        product.setPrice(productTo.getPrice());
//        product.setQuantity(productTo.getQuantity());
//        return product;
//    }
//
//
//    public static List<ProductTo> getToListFrom(Product product) {
//        List<ProductTo> productTos = new ArrayList<>();
//        if (product.getHasVariations()) {
//            productTos.addAll(product.getVariations().stream().map(productVariation -> new ProductTo(
//                    product.getId()
//                    , productVariation.getId()
//                    , product.getName() + " " + productVariation.getVariationValue().getName()
//                    , productVariation.getPrice()
//                    , productVariation.getQuantity()
//                    , product.getUnlimited()))
//                    .collect(Collectors.toList()));
//        } else {
//            productTos.add(new ProductTo(
//                    product.getId()
//                    , 0
//                    , product.getName()
//                    , product.getPrice()
//                    , product.getQuantity()
//                    , product.getUnlimited()));
//        }
//        return productTos;
//    }
}
