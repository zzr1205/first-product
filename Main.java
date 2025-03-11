import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductCategoryDao dao = new ProductCategoryDaoImpl();
        List<ProductCategory> data = dao.findAllWithCategory();

        // 遍历输出
        for (ProductCategory pc : data) {
            System.out.printf("图书编号: %s，图书名称: %s，类别名称: %s\n",
                    pc.getProductId(), pc.getProductName(), pc.getCategoryName());
        }
    }
}