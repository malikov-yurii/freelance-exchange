package com.malikov.freelance.web.product;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = ProductRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductRestController extends AbstractProductController {

//    static final String REST_URL = "/rest/profile/products";
//
//    @GetMapping("/{id}")
//    public Product get(@PathVariable("id") int id) {
//        return super.get(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") int id) {
//        super.delete(id);
//    }
//
//    @GetMapping
//    public List<ProductTo> getAll() {
//        return super.getAll();
//    }
//
//    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void update(@Valid @RequestBody Product product, @PathVariable("id") int id) {
//        super.update(product, id);
//    }
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Product> createWithLocation(@RequestBody Product product) {
//        Product created = super.create(product);
//
//        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path(REST_URL + "/{id}")
//                .buildAndExpand(created.getId()).toUri();
//
//        return ResponseEntity.created(uriOfNewResource).body(created);
//    }
//
//    @GetMapping(value = "/between")
//    public List<ProductTo> getBetween(
//            @RequestParam(value = "startDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDateTime,
//            @RequestParam(value = "endDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDateTime) {
//        return super.getBetween(startDateTime.toLocalDate(), startDateTime.toLocalTime(), endDateTime.toLocalDate(), endDateTime.toLocalTime());
//    }
//
//    @RequestMapping(value = "/filter", method = RequestMethod.GET)
//    public List<ProductTo> getBetween(
//            @RequestParam(value = "startDate", required = false) LocalDate startDate, @RequestParam(value = "startTime", required = false) LocalTime startTime,
//            @RequestParam(value = "endDate", required = false) LocalDate endDate, @RequestParam(value = "endTime", required = false) LocalTime endTime) {
//        return super.getBetween(startDate, startTime, endDate, endTime);
//    }
}