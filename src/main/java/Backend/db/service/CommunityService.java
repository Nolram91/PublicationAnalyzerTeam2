package Backend.db.service;

import Backend.db.entity.Community;
import Backend.db.dao.CommunityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {

    @Autowired
    CommunityDao communityDao;

    public List getAllCommunities() { return this.communityDao.findAll(); }

    // hier evtl die übergebene Gruppe als Child der Mother definieren
    public Community addCommunity(Community community) {
        return this.communityDao.save(community); }
}