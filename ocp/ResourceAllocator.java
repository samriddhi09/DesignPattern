package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */

public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) {
        Resource resource = ResourceFactory.createResource(resourceType);
        resource.markBusy();
        return 0; 
    }

    public void free(ResourceType resourceType, int resourceId) {
        Resource resource = ResourceFactory.createResource(resourceType);
        
        resource.markFree();
    }
}
