package at.ac.tgm.warehouse.warehouse;

import at.ac.tgm.warehouse.model.WarehouseData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/")
    public String warehouseMain() {
    	String mainPage = "Warehouse Application<br/><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/data'>Link to warehouse/001/data</a><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/xml'>Link to warehouse/001/xml</a><br/>" +
                          "<a href='http://localhost:8080/warehouse/001/transfer'>Link to warehouse/001/transfer</a><br/>";
        return mainPage;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/warehouse/{inID}/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public WarehouseData warehouseData(@PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/warehouse/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WarehouseData warehouseDataXML( @PathVariable String inID ) {
        return service.getWarehouseData( inID );
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/warehouse/{inID}/transfer")
    public String warehouseTransfer( @PathVariable String inID ) {
        return service.getGreetings("Warehouse.Transfer!");
    }

}