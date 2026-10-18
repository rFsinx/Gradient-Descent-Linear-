# Gradient Descent & Multivariable Calculus Extension

## Sum of squared residuals

a quadratic function, leading coefficient > 0 $\implies$ its derivative = 0 $\Leftrightarrow$ its minimum
has convex paraboloid shape

$$
f(a, s) = \sum ((ax_i + s)-y_i)^2
$$

**Partial Derivatives**:

$$
\frac{\partial f}{\partial s} = \sum 2((ax_i + s) - y_i) \qquad \frac{\partial F}{\partial a} = \sum 2x_i((ax_i + s) - y_i)
$$

**Step SIze (using learning rate $\eta$):**

$$
s_{n+1} = s_n - \eta \ \left. \frac{\partial f}{\partial s} \right |_{(a, s) = (a_n, s_n)} \quad \text{and} \quad a_{n+1} = a_n - \eta \ \left. \frac{\partial f}{\partial a} \right |_{(a, s) = (a_n, s_n)}
$$


## 2D Gradient Application (z = f(a, s))

**Visualization:**

<p align="center">
  <img src="gradient descent visualization.png" alt="3D Paraboloid & 2D Convergence Contour Map" width="100%">
</p>

- Paraboloid Mapping (Left): Illustrates the Sum of Squared Residuals (SSR) as a convex function. The red curve tracks 3D gradient descent descent path on the surface toward the global minimum (Vertex).

- 2D Vector Contour Projection (Right): optimization trajectory ($\vec{x}_n = a_n \hat{i} + s_n \hat{j}$) on the parameter plane (a-axis vs s-axis).

  It visually shows how sequence of updated vector component converges to the precise analytical limits: $\lim_{n \to \infty} a_n = a_{\text{vertex}}$ and $\lim_{n \to \infty} s_n = s_{\text{vertex}}$.


$\nabla F$ is a vector field (having vector outputs)

<p align="center">
  <img src="Gradient Descent Summary (updated version) 2.pdf" alt="" width="100%">
</p>

$$
\nabla f(a, s) = \frac{\partial f}{\partial a} \ \hat{i} + \frac{\partial f}{\partial s} \ \hat{j}
$$

**Vectorized Step Size ($\eta$):**

goal: toward vertex's coordinate on as-plane

$$
\vec{x}_n = a_n \hat{i} + s_n \hat{j} \quad \text{(on as-plane)}
$$


$$
\therefore \quad \vec{x}_{n+1} = \vec{x}_n - \eta \ \nabla F(a_n, s_n) \quad \Leftrightarrow \quad s_{n+1} = s_n - \eta \ \left. \frac{\partial f}{\partial s} \right |_{(a, s) = (a_n, s_n)} \quad \text{and} \quad a_{n+1} = a_n - \eta \ \left. \frac{\partial f}{\partial a} \right |_{(a, s) = (a_n, s_n)}
$$

both are essentially the same statement ($a \leftrightarrow b \text{  means  } a = b$)


## Project Overview
- (Implementation):  Expanded a previously completed AP Calculus AB project by integrating partial differentiation to upgrade a Java-based linear regression tool for highway traffic modeling.
- (Tools Extension): Self-studied Vector Calculus to re-analyze the optimization trajectory via 2D Gradient Field (∇f).

# Convergence & Limitations
- The algorithm requires a sufficiently small learning rate (η) to ensure convergence. On a paraboloid surface (unsure about other shapes), convergence slows significantly near the local minimum as the gradient magnitude approaches zero (||∇f|| ≈ 0), illustrating the classic vanishing gradient behavior in basic optimization
- 
# Bonus (Feb 2026):
  - curiosity about cross product (coordinate derivation) & curl: Tried to link curl and rotation using mechanical torque.

<p align="center">
  <img src="cross product proof - curl vector calculus insight.pdf" alt="" width="100%">
</p>
