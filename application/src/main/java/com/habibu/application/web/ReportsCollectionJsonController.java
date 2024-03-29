package com.habibu.application.web;
import com.habibu.model.Report;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import com.habibu.service.api.ReportService;
import io.springlets.data.domain.GlobalSearch;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

/**
 * = ReportsCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Report.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
@RestController
@RequestMapping(value = "/api/reports", name = "ReportsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReportsCollectionJsonController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ReportService reportService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param reportService
     */
    @Autowired
    public ReportsCollectionJsonController(ReportService reportService) {
        this.reportService = reportService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ReportService
     */
    public ReportService getReportService() {
        return reportService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param reportService
     */
    public void setReportService(ReportService reportService) {
        this.reportService = reportService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<Report>> list(GlobalSearch globalSearch, Pageable pageable) {
        Page<Report> reports = getReportService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(reports);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return UriComponents
     */
    public static UriComponents listURI() {
        return MvcUriComponentsBuilder.fromMethodCall(MvcUriComponentsBuilder.on(ReportsCollectionJsonController.class).list(null, null)).build().encode();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param report
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> create(@Valid @RequestBody Report report, BindingResult result) {
        if (report.getId() != null || report.getVersion() != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        Report newReport = getReportService().save(report);
        UriComponents showURI = ReportsItemJsonController.showURI(newReport);
        return ResponseEntity.created(showURI.toUri()).build();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param reports
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> createBatch(@Valid @RequestBody Collection<Report> reports, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        getReportService().save(reports);
        return ResponseEntity.created(listURI().toUri()).build();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param reports
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> updateBatch(@Valid @RequestBody Collection<Report> reports, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        getReportService().save(reports);
        return ResponseEntity.ok().build();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        getReportService().delete(ids);
        return ResponseEntity.ok().build();
    }
}
