public class UpdateMaterial {

    private Material[] materials = new Material[100];
    private int count = 0;

    public void addMaterial(Material material) {
        if (count >= materials.length) {
            System.out.println("Cannot add more materials. The list is full.");
            return;
        }
        materials[count++] = material;
    }

    public boolean checkIdExist(String id) {
        return findMaterialIndexById(id) != -1;
    }

    public void updateMaterial(String id, Material newMaterial) {
        int index = findMaterialIndexById(id);
        if (index != -1) {
            materials[index] = newMaterial;
        }
    }

    public void deleteMaterial(String id) {
        int index = findMaterialIndexById(id);
        if (index == -1) {
            System.out.println("No material found with ID: " + id);
            return;
        }
        for (int i = index; i < count - 1; i++) {
            materials[i] = materials[i + 1];
        }
        materials[count - 1] = null;
        count--;
    }

    private int findMaterialIndexById(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Material[] getAllMaterials() {
        Material[] currentMaterials = new Material[count];
        for (int i = 0; i < count; i++) {
            currentMaterials[i] = materials[i];
        }
        return currentMaterials;
    }
}
