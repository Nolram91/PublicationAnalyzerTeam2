package Backend.db.controller;


import Backend.db.entity.Community;
import Backend.db.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/communities")
@CrossOrigin(origins = "http://localhost:4200")
public class CommunityController {

    @Autowired
    CommunityService communityService;

    @GetMapping(path = {"/all"})
    public List getAllCommunities() {
        return communityService.getAllCommunities();
    }

    @PostMapping(path = {"/add"})
    public Community addNewCommunity(@RequestBody Community community) {
        return this.communityService.addCommunity(community);
    }
}
