package gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - to store uncommitted changes";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Perform git fetch command - to fetch the origin branches";
        String step4 = "Perform git checkout -b new_branch_name command - to create and instantly move to a new branch, " + "that is identical to local master branch";
        String step5 = "Add your changes that relates to the task";
        String step6 = "Review your changes and check your code before committing them";
        String step7 = "Execute git commit by using the Intellij interface, where you can select what changes you want to commit";
        String step8 = "Once all the changes are committed, execute a git push command using CTRL+AY+K hot keys";
        String step9 = "The committed changes are pushed to an origin branch with the same name, navigate to the Github branch";
        String step10 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step11 = "Add the Pull Request details - name, description and request review from our colleagues";
        String step12 = "If you collect at least 1 approval from your colleagues then merge the branch";
        String step13 = "After that, the origin/master contains the latest changes and the origin/new_branch and the origin/new_branch_name can be deleted";
        String step14 = "Do not forget that locally you are still on the new_branch_name, it's good to move back to master";
        String step15 = "However, the local master branch does not have the latest changes,therefore perform a git fetch and git pull";


        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
    }
}
