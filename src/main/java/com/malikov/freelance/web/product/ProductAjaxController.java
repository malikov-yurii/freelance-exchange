package com.malikov.freelance.web.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ajax/profile/products")
public class ProductAjaxController extends AbstractProductController {

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<ProductTo> getAll() {
//        return super.getAll();
//    }
//
//    @GetMapping(value = "/{id}")
//    public Product get(@PathVariable("id") int id) {
//        return super.get(id);
//    }
//
//
//    @DeleteMapping(value = "/{id}")
//    public void delete(@PathVariable("id") int id) {
//        super.delete(id);
//    }
//
//    @PostMapping
//    public ResponseEntity<String> updateOrCreate(@Valid ProductTo productTo, BindingResult result) {
//        if (result.hasErrors()) {
//            StringBuilder sb = new StringBuilder();
//            result.getFieldErrors().forEach(fe -> sb.append(fe.getField()).append(" ").append(fe.getDefaultMessage()).append("<br>"));
//            return new ResponseEntity<>(sb.toString(), HttpStatus.UNPROCESSABLE_ENTITY);
//        }
//        if (productTo.isNew()) {
//            super.create(ProductUtil.createNewFromTo(productTo));
//        } else {
//            Product product = super.get(productTo.getProductVariationId());
//            super.update(ProductUtil.updateFromTo(product, productTo), productTo.getProductVariationId());
//        }
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/filter", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<ProductTo> getBetween(
//            @RequestParam(value = "startDate", required = false) LocalDate startDate,
//            @RequestParam(value = "startTime", required = false) LocalTime startTime,
//            @RequestParam(value = "endDate", required = false) LocalDate endDate,
//            @RequestParam(value = "endTime", required = false) LocalTime endTime) {
//        return super.getBetween(startDate, startTime, endDate, endTime);
//    }
//
//    @PostMapping(value = "/{id}/change-unlimited")
//    public void changeUnlimited(@PathVariable("id") int id, @RequestParam("unlimited") boolean unlimited) {
//        super.enableUnlimited(id, unlimited);
//    }
//
//    @PostMapping(value = "/{id}/change-variations")
//    public void changeHasVariations(@PathVariable("id") int id, @RequestParam("hasVariations") boolean hasVariations) {
//        super.enableHasVariations(id, hasVariations);
//    }
}
