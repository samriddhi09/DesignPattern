package solid.live.ocp;

public class ResourceFactory {
    public static Resource createResource(ResourceType resourceType) {
        switch (resourceType) {
            case TIME_SLOT:
                return new TimeSlotResource();
            case SPACE_SLOT:
                return new SpaceSlotResource();
            default:
                throw new IllegalArgumentException("Invalid resource type");
        }
    }
}
